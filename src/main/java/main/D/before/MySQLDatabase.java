package main.D.before;

/**
 * MySQLDatabase
 */
public class MySQLDatabase {
    private String host;
    private int port;

    public MySQLDatabase(String host, int port) {
        this.host = host;
        this.port = port;
    }

    public void insert() {
        System.out.println("Melakukan insert");
    }

    public void update() {
        System.out.println("Melakukan update");
    }

    public void delete() {
        System.out.println("Melakukan delete");
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
