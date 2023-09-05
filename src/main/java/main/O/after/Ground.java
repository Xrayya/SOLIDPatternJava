package main.O.after;

import java.util.Date;

/**
 * Ground
 */
public class Ground implements Shipping{

    @Override
    public double getCost(AfterSolidOrder order) {
            if (order.getTotal() > 100) {
                return 0;
            }

            return Math.max(10, order.getTotalWeight() * 1.5);
    }

    @Override
    public Date getDate(AfterSolidOrder order) {
        return null;
    }
}
