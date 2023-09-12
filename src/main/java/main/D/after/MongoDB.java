package main.D.after;

/**
 * MongoDB
 */
public class MongoDB implements Database{
    private String host;
    private int port;

    public MongoDB(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public void delete() {
        System.out.println("Melakukan delete");
    }

    @Override
    public void insert() {
        System.out.println("Melakukan insert");
    }

    @Override
    public void update() {
        System.out.println("Melakukan update");
    }
}
