package main.O.after;

import java.util.Date;

/**
 * Sea
 */
public class Sea implements Shipping {

    @Override
    public double getCost(AfterSolidOrder order) {
        return Math.max(15, order.getTotalWeight() * 2);
    }

    @Override
    public Date getDate(AfterSolidOrder order) {
        return null;
    }
}
