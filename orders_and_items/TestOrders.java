import java.util.ArrayList;

// Create the testing file TestOrders and complete the rest of the tasks inside the testing file.
public class TestOrders {

    public static void main(String[] args) {

        // Create 4 item variables of type Item and instantiate each as an Item object. Name them item1, item2 etc.
        // Set the price and the name for each -- "mocha", "latte", "drip coffee" and "capuccino" (price is up to you!)
        // Menu items
        Items item1 = new Items();
        item1.name = "mocha";
        item1.price = 3.80;

        Items item2 = new Items();
        item2.name = "latte";
        item2.price = 4.00;

        Items item3 = new Items();
        item2.name = "drip coffee";
        item2.price = 3.50;

        Items item4 = new Items();
        item2.name = "capuccino";
        item2.price = 3.80;


        // Order variables -- order1, order2 etc.
        // Create 4 order variables of type Order and instantiate each as an Order object. Name them order1, order2 etc.
        Orders order1 = new Orders();

        // Print the order1 variable to the console to see what happens.
        // Predict what will happen if you print order1.total -- 0.00 BECAUSE CINDHURI DIDN'T ORDER ANYTHING YET.
        System.out.println(order1.total);


        // Set each order's name -- "Cindhuri", "Jimmy", "Noah", "Sam".
        order1.name = "Cindhuri";

        Orders order2 = new Orders();
        order2.name = "Jimmy";

        Orders order3 = new Orders();
        order3.name = "Noah";

        Orders order4 = new Orders();
        order4.name = "Sam";

        
        // Application Simulations
        // Add item1 to order2's item list and increment the order's total.
        order2.items.add(item1);
        order2.total += item1.price;

    
        // order3 ordered a cappucino. Add the cappuccino to their order list and to their tab.
        order3.items.add(item4);
        order3.total += item4.price;


        // order4 added a latte. Update accordingly.
        order4.items.add(item2);
        order4.total += item2.price;

        
        // Cindhuri’s order is now ready. Update her status.
        order1.ready = true;


        // Sam ordered more drinks - 2 lattes. Update their order as well.
        order4.items.add(item2);
        order4.items.add(item2);
        order4.total += item2.price * 2;


        // Jimmy’s order is now ready. Update his status.
        order2.ready = true;


        // Use this example code to test various orders' updates
        // Order1
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        // Order2
        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);

        // Order3
        System.out.printf("Name: %s\n", order3.name);
        System.out.printf("Total: %s\n", order3.total);
        System.out.printf("Ready: %s\n", order3.ready);
    
        
        // Order4
        System.out.printf("Name: %s\n", order4.name);
        System.out.printf("Total: %s\n", order4.total);
        System.out.printf("Ready: %s\n", order4.ready);
    }
}
