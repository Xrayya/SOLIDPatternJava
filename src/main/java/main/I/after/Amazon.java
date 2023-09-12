package main.I.after;

import java.io.File;
import java.util.ArrayList;

import main.I.Region;
import main.I.Server;

/**
 * Amazon
 */
public class Amazon implements CloudHostingProvider, CDNProvider, CloudStorageProvider {

    private String CDNAddress = "78.34.44.123";
    private ArrayList<Server> servers = new ArrayList<>();
    private ArrayList<File> files = new ArrayList<>();

    @Override
    public void createServer(Region region) {
        this.servers.add(new Server(region));
    }

    @Override
    public String getCDNAddress() {
        return this.CDNAddress;
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
        return servers.toArray(new Server[0]);
    }

    @Override
    public void storeFile(File fileName) {
        this.files.add(fileName);
    }
}
