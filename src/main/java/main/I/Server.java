package main.I;

/**
 * Server
 *
 * Data yang disimpan dalam objek ini berupa data lokasi dan IP Address. IP
 * Address akan digenerate secara otomatis saat instansiasi objek
 */
public class Server {

    private Region region;
    private String ipAddress;

    public Server(Region region) {
        this.region = region;
        this.ipAddress = this.generateRandomIpAddress();
    }

    /**
     * Method pembantu yang digunakan untuk mengenerate IP Adress secara random
     * 
     * @return sebuah string dengan formalt IPv4
     */
    private String generateRandomIpAddress() {
        return String.format("%d.%d.%d.%d",
                generateRandomNumber(255),
                generateRandomNumber(255),
                generateRandomNumber(255),
                generateRandomNumber(255));
    }

    /**
     * Method pembantu untuk mengenerate bilangan bulat random dengan nilai maksimal
     * tertentu
     * 
     * @param maxValue
     * @return sebuah bilangan bulat yang berkisar antara 0 - `maxValue`
     */
    private int generateRandomNumber(int maxValue) {
        return Math.min(maxValue,
                (int) Math.round(Math.random() * (Math.random() <= 0.5 ? 10 : Math.random() <= 0.5 ? 100 : 1000)));
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public String getIpAddress() {
        return ipAddress;
    }

}
