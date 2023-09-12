package main.D.after;

import java.util.Date;

/**
 * BudgetReport
 */
public class BudgetReport {

    private Database database;

    public BudgetReport(Database database) {
        this.database = database;
    }

    public void open(Date date) {
        System.out.printf("Membuka data pada tanggal", date.toString());
        // logika SELECT data dari database
    }

    public void save() {
        System.out.println("Menyimpan data");
    }
}
