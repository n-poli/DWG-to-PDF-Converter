# DWG-to-PDF-Converter

## 📌 Description

Desktop application developed in Java (Swing) that allows users to select a folder containing `.dwg` files and convert them into `.pdf` format.

The goal of this project is to demonstrate:

* desktop GUI development
* file system handling
* separation between UI and business logic
* clean and modular project structure

---

## ⚙️ Features

* 📁 Select a folder from the file system
* 📄 Display `.dwg` files inside the selected folder
* 🔄 Convert `.dwg` files to `.pdf`
* 📂 Automatic creation of a `pdf` subfolder
* ❌ Reset application state via "Cancel" button

---

## 🏗️ Project Structure

```
src/
 ├── Main.java                // Application entry point
 ├── ui/
 │    └── MainFrame.java     // Swing UI
 ├── service/
 │    └── ConversionService.java // Conversion logic
 └── model/
      └── DwgFile.java       // Data model (optional)
```

### 🔹 Design Choices

* Clear separation between **UI and logic** (single responsibility principle)
* Modular structure for maintainability and scalability
* Readable and well-commented code

---

## 🚀 How to Run

1. Open the project in IntelliJ IDEA
2. Run `Main.java`
3. Use the interface:

   * Select a folder containing `.dwg` files
   * Preview detected files
   * Click "Convert to PDF"

---

## 🧪 Testing

Manual testing covered:

* ✅ Folder selection
* ✅ `.dwg` file detection
* ✅ `pdf` folder creation
* ✅ PDF file generation
* ✅ Application reset

---

## ⚠️ Note on DWG → PDF Conversion

Real DWG to PDF conversion is **not fully implemented**.

Currently:

* conversion is simulated
* or a basic PDF is generated (if a library like PDFBox is integrated)

### 🔧 For real conversion

A dedicated external library would be required, such as:

* Teigha / Open Design Alliance
* Aspose.CAD
* Other CAD-specific SDKs

The project architecture is designed to easily integrate such tools.

---

## 💡 Possible Improvements

* Real DWG preview
* Drag & drop folder support
* Conversion progress bar
* Advanced logging
* Multi-folder support
* Integration with a real CAD library

---

## 🧠 Notes

This project was developed with focus on:

* simplicity and clarity
* clean code practices
* extensibility for real-world use cases
