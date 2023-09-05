package main.O;

import java.util.LinkedList;

import main.O.after.AfterSolidOrder;
import main.O.after.Air;
import main.O.after.Ground;
import main.O.after.Sea;
import main.O.before.BeforeSolidOrder;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        LineItem item1 = new LineItem(1, "Shamphoo", 100);
        LineItem item2 = new LineItem(2, "Soap", 300);
        LineItem item3 = new LineItem(3, "Detergent", 800);
        LineItem item4 = new LineItem(4, "Comb", 10);

        LinkedList<LineItem> list = new LinkedList<>();
        list.addLast(item1);
        list.addLast(item2);
        list.addLast(item3);
        list.addLast(item4);

        BeforeSolidOrder nonSolidOrder1 = new BeforeSolidOrder(list, "air");
        BeforeSolidOrder nonSolidOrder2 = new BeforeSolidOrder(list, "ground");
        BeforeSolidOrder nonSolidOrder3 = new BeforeSolidOrder(list, "sea");

        System.out.println(nonSolidOrder1.getShippingCost());
        System.out.println(nonSolidOrder2.getShippingCost());
        // System.out.println(nonSolidOrder3.getShippingCost());

        AfterSolidOrder solidOrder1 = new AfterSolidOrder(list, new Air());
        AfterSolidOrder solidOrder2 = new AfterSolidOrder(list, new Ground());
        AfterSolidOrder solidOrder3 = new AfterSolidOrder(list, new Sea());

        System.out.println(solidOrder1.getShippingCost());
        System.out.println(solidOrder2.getShippingCost());
        System.out.println(solidOrder3.getShippingCost());
    }
}
