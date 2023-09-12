package main.I.before;

import java.io.File;
import java.util.ArrayList;

import main.I.Region;
import main.I.Server;

/**
 * Dropbox
 */
public class Dropbox implements CloudProvider {

    private ArrayList<File> files = new ArrayList<>();

    @Override
    public void createServer(Region region) {

    }

    @Override
    public String getCDNAddress() {
        return null;
    }

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
    public Server[] listServers(Region region) {
        return null;
    }

    @Override
    public void storeFile(File fileName) {
        this.files.add(fileName);
    }
}
