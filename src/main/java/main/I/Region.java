package main.I;

/**
 * Region
 *
 * Menyimpan informasi mengenai lokasi. informasi yang disimpan meliputi id,
 * nama region, dan koordinat
 */
public class Region {
    private String id;
    private String name;
    private String coordinate;

    public Region(String id, String name, String coordinate) {
        this.id = id;
        this.name = name;
        this.coordinate = coordinate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(String coordinate) {
        this.coordinate = coordinate;
    }
}
