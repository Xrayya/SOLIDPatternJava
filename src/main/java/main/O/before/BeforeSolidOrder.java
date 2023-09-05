package main.O.before;

import java.util.Date;
import java.util.LinkedList;

import main.O.LineItem;

/**
 * BeforeSolid
 */
public class BeforeSolidOrder {
    private LinkedList<LineItem> lineItems = new LinkedList<>();
    private String shipping;

    public BeforeSolidOrder(LinkedList<LineItem> lineItems, String shipping) {
        this.lineItems = lineItems;
        this.shipping = shipping;
    }

    public int getTotal() {
        return lineItems.size();
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (LineItem item : lineItems) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public void setShippingType(String st) {
        this.shipping = st;
    }

    public double getShippingCost() {
        if (this.shipping.equals("ground")) {
            if (this.getTotal() > 100) {
                return 0;
            }

            return Math.max(10, getTotalWeight() * 1.5);
        }

        // if (this.shipping.equals("sea")) {
        // return Math.max(15, getTotalWeight() * 2);
        // }

        return Math.max(20, getTotalWeight() * 3);
    }

    public Date getShippingDate() {
        return null;
    }
}
