package main.I.after;

import java.io.File;

/**
 * CloudStorageProvider
 */
public interface CloudStorageProvider {

    public void storeFile(File fileName);

    public File getFile(String name);
}
