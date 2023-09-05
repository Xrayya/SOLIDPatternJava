package main.O.after;

import java.util.Date;

/**
 * Shipping
 */
public interface Shipping {
    public double getCost(AfterSolidOrder order);
    public Date getDate(AfterSolidOrder order);
}
