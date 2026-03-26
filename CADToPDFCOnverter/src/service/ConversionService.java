package service;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ConversionService {

    // separiamo la logica dalla UI → più pulito e riusabile
    public static void convert(File folder, DefaultListModel<File> model) {

        File pdfDir = new File(folder, "pdf");

        if (!pdfDir.exists()) {
            pdfDir.mkdir();
        }

        for (int i = 0; i < model.size(); i++) {
            File dwgFile = model.get(i);
            String pdfName = dwgFile.getName().replace(".dwg", ".pdf");

            try {
                Files.writeString(
                        new File(pdfDir, pdfName).toPath(),
                        "PDF generato da " + dwgFile.getName()
                );
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}