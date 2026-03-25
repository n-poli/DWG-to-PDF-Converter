# DWG-to-PDF-Converter

A desktop application built in C# for batch converting CAD files (DWG/DXF) into PDF format through a simple and intuitive interface.

## ✨ Overview

This project was developed as a technical assignment to demonstrate file handling, UI design, and integration with external tools in a real-world scenario.

The application allows users to import a folder containing CAD files, preview them, and convert them into PDF documents in a single operation.

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

* C#
* WinForms (.NET)
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

PDF conversion is performed through integration with progeCAD (or simulated when direct automation is not available).

The focus of this project is on:

* batch processing logic
* system design
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

* Separation between UI and processing logic
* Scalability for handling large file sets
* Basic error handling to prevent crashes
* Clear and minimal user workflow

---

## 🔮 Future Improvements

* Progress bar during conversion
* Drag & drop folder support
* Advanced error logging
* Support for additional formats
* Direct integration with CAD APIs
