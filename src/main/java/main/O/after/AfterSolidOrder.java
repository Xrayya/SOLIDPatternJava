package main.O.after;

import java.util.Date;
import java.util.LinkedList;

import main.O.LineItem;

/**
 * AfterSolidOrder
 */
public class AfterSolidOrder {
    private LinkedList<LineItem> lineItems = new LinkedList<>();
    private Shipping shipping;

    public AfterSolidOrder(LinkedList<LineItem> lineItems, Shipping shipping) {
        this.lineItems = lineItems;
        this.shipping = shipping;
    }

    public LinkedList<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(LinkedList<LineItem> lineItems) {
        this.lineItems = lineItems;
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

    public void setShippingType(Shipping shipping) {
        this.shipping = shipping;
    }

    public double getShippingCost() {
        return shipping.getCost(this);
    }

    public Date getShippingDate() {
        return shipping.getDate(this);
    }
}
