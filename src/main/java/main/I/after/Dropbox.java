package main.I.after;

import java.io.File;
import java.util.ArrayList;

/**
 * Dropbox
 */
public class Dropbox implements CloudStorageProvider {

    private ArrayList<File> files = new ArrayList<>();

    @Override
    public File getFile(String name) {
        for (File file : files) {
            if (file.getName().equals(name)) {
                return file;
            }
        }

        return null;
    }

    @Override
    public void storeFile(File fileName) {
        this.files.add(fileName);
    }
}
