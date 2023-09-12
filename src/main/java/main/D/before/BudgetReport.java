package main.D.before;

import java.util.Date;

/**
 * BudgetReport
 */
public class BudgetReport {

    private MySQLDatabase database;

    public BudgetReport() {
        this.database = new MySQLDatabase("73.42.48.12", 8790);
    }

    public void open(Date date) {
        System.out.printf("Membuka data pada tanggal", date.toString());
        // logika SELECT data dari database
    }

    public void save() {
        System.out.println("Menyimpan data");
    }
}
