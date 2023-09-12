package main.I.after;

import main.I.Region;
import main.I.Server;

/**
 * CloudHostingProvider
 */
public interface CloudHostingProvider {
    public void createServer(Region region);

    public Server[] listServers(Region region);
}
