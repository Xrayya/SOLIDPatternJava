package main.O.after;

import java.util.Date;

/**
 * Air
 */
public class Air implements Shipping{

    @Override
    public double getCost(AfterSolidOrder order) {
        return Math.max(20, order.getTotalWeight() * 3);
    }

    @Override
    public Date getDate(AfterSolidOrder order) {
        return null;
    }
}
