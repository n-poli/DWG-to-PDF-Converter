package model;

import java.io.File;

public class DwgFile {

    private File file;

    public DwgFile(File file) {
        this.file = file;
    }

    public String getName() {
        return file.getName();
    }

    public File getFile() {
        return file;
    }
}