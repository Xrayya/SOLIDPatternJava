package main.O;

/** LineItem */
public class LineItem {
    private int id;
    private String name;
    private double weight;

    public LineItem(int id, String name, double weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
