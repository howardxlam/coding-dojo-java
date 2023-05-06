import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {

        Item item1 = new Item("mocha", 4);
        Item item2 = new Item("latte", 3.5);
        Item item3 = new Item("drip coffee", 2);
        Item item4 = new Item("cappuccino", 3);
    
        // Menu items
        // item1.setName("mocha");
        // item1.setPrice(4);
        // item2.setName("latte");
        // item2.setPrice(3.5);
        // item3.setName("drip coffee");
        // item3.setPrice(2);
        // item4.setName("cappuccino");
        // item4.setPrice(3);

        Order order1 = new Order();
        order1.addItem(item1);
        order1.addItem(item1);
        // System.out.println(order1.getOrderTotal());
        order1.display();

        Order order2 = new Order();
        order2.addItem(item3);
        order2.addItem(item1);
        // order2.setReady(true);
        // System.out.println(order2.getOrderTotal());
        // System.out.println(order2.getStatusMessage());
        order2.display();

        Order order3 = new Order("Cindhuri");
        order3.addItem(item1);
        order3.addItem(item1);
        order3.setReady(true);
        System.out.println(order3.getStatusMessage());
        order3.display();

        Order order4 = new Order("Jimmy");
        order4.addItem(item2);
        order4.addItem(item4);
        // System.out.println(order4.getStatusMessage());
        order4.display();

        Order order5 = new Order("Noah");
        order5.addItem(item4);
        order5.addItem(item4);
        order5.display();

        Order order6 = new Order("Sam");
        order6.addItem(item1);
        order6.addItem(item2);
        // System.out.println(order6.getStatusMessage());
        order6.display();

    }
}