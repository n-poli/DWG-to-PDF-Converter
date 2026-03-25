# DWG-to-PDF-Converter

A desktop application built in C# for batch converting CAD files (DWG/DXF) into PDF format through a simple and intuitive interface.

## ✨ Overview
This project was developed as a technical assignment to demonstrate file handling, UI design, and batch processing.

Due to development in a Linux environment, the application was implemented in Java instead of C#, while preserving the requested functionality and overall design.

---

## 🚀 Features

* 📂 Import a single folder from the file system
* 📄 Display and preview CAD file list (DWG/DXF)
* 🔁 Batch conversion to PDF
* 📁 Automatic creation of `/pdf` output directory
* 🧭 Simple and user-friendly interface
* ❌ Cancel operation support

---

## 🖥️ Tech Stack

* Java
* JavaFX
* File System APIs

---

## ⚙️ How It Works

1. Click **Import Folder**
2. Select a directory containing CAD files
3. The application scans and lists supported files
4. Click **Convert**
5. Output PDFs are generated inside a `/pdf` subfolder

---

## 🔧 Conversion Approach

PDF conversion is designed to integrate with progeCAD or external tools when available.

In this version, the focus is on:
* batch processing logic
* application structure
* user interaction

---

## 🧪 Example Use Case

Batch conversion of technical drawings into PDF format for documentation, sharing, or archiving.

---

## 📌 Project Status

🟡 Work in progress — actively being developed and improved.

---

## 📷 Screenshots

*(to be added)*

---

## 🧠 Design Considerations

## 🧠 Design Considerations
* Cross-platform compatibility (Linux-based development)
* Separation between UI and processing logic
* Scalable structure for batch file handling
* Minimal and intuitive user workflow

---

## 🔮 Future Improvements

* Progress bar during conversion
* Drag & drop folder support
* Advanced error logging
* Support for additional formats
* Direct integration with CAD APIs

---

## 📎 Notes
The project replicates the requested behavior and workflow of the original C# assignment, adapting the implementation to a Java-based environment.
