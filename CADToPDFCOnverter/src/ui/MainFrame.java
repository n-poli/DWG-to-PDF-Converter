package ui;

import service.ConversionService;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.Arrays;

public class MainFrame extends JFrame {

    // Label che mostra il nome della cartella selezionata
    private JLabel folderLabel;

    // Modello lista file DWG
    private DefaultListModel<File> model;

    // Lista visiva
    private JList<File> fileList;

    // Cartella selezionata
    private File selectedFolder;

    public MainFrame() {
        setTitle("DWG to PDF Converter");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        initUI();
    }

    // Costruzione interfaccia grafica
    private void initUI() {
        JPanel root = new JPanel(new BorderLayout(10, 10));
        root.setBorder(new EmptyBorder(10, 10, 10, 10));

        // -------- TOP: bottone selezione cartella --------
        JPanel topPanel = new JPanel(new BorderLayout());
        JButton selectFolderBtn = new JButton("Seleziona Cartella");
        selectFolderBtn.addActionListener(this::onSelectFolder);
        topPanel.add(selectFolderBtn, BorderLayout.EAST);

        // -------- SINISTRA: nome cartella --------
        folderLabel = new JLabel("Nessuna cartella selezionata");

        // -------- CENTRO: lista file DWG --------
        model = new DefaultListModel<>();
        fileList = new JList<>(model);
        JScrollPane scrollPane = new JScrollPane(fileList);

        // -------- BOTTOM: bottoni --------
        JPanel bottomPanel = new JPanel(new BorderLayout(10, 10));

        JButton cancelBtn = new JButton("Annulla");
        cancelBtn.addActionListener(e -> clearSelection());

        JButton convertBtn = new JButton("Converti in PDF");
        convertBtn.addActionListener(e -> convertFiles());

        bottomPanel.add(cancelBtn, BorderLayout.WEST);
        bottomPanel.add(convertBtn, BorderLayout.EAST);

        // -------- ASSEMBLAGGIO --------
        root.add(topPanel, BorderLayout.NORTH);
        root.add(folderLabel, BorderLayout.WEST);
        root.add(scrollPane, BorderLayout.CENTER);
        root.add(bottomPanel, BorderLayout.SOUTH);

        setContentPane(root);
    }

    // ================= LOGICA =================

    // Quando clicchi "Seleziona Cartella"
    private void onSelectFolder(ActionEvent e) {
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int result = chooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFolder = chooser.getSelectedFile();

            // aggiorno label
            folderLabel.setText(selectedFolder.getAbsolutePath());

            // carico file DWG
            loadDWGFiles();
        }
    }

    // Carica solo file .dwg nella lista
    private void loadDWGFiles() {
        model.clear();

        File[] files = selectedFolder.listFiles(
                (dir, name) -> name.toLowerCase().endsWith(".dwg")
        );

        if (files != null) {
            Arrays.stream(files).forEach(model::addElement);
        }
    }

    // Reset stato (bottone Annulla)
    private void clearSelection() {
        selectedFolder = null;
        folderLabel.setText("Nessuna cartella selezionata");
        model.clear();
    }

    // Chiamata al service (qui NON facciamo la conversione direttamente!)
    private void convertFiles() {

        if (selectedFolder == null || model.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nessun file da convertire");
            return;
        }

        // Qui deleghiamo tutto al service → codice pulito
        ConversionService.convert(selectedFolder, model);

        JOptionPane.showMessageDialog(this, "Conversione completata!");
    }
}