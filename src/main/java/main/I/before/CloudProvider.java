package main.I.before;

import java.io.File;

import main.I.Region;
import main.I.Server;

/**
 * CloudProvider
 */
public interface CloudProvider {

    public void storeFile(File fileName);

    public File getFile(String name);

    public void createServer(Region region);

    public Server[] listServers(Region region);

    public String getCDNAddress();
}
