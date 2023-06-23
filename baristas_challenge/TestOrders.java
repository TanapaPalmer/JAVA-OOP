public class TestOrders {
    public static void main(String[] args){

        // Menu items
        Items item1 = new Items("drip coffee", 3.50);
        Items item2 = new Items("capuccino", 4.00);
        Items item3 = new Items("iced coffee", 3.00);
        Items item4 = new Items("mocha", 3.80);

        // Create 2 orders for unspecified guests (without specifying a name);
        Orders order1 = new Orders();
        Orders order2 = new Orders();

        // Create 3 orders using the overloaded constructor to give each a name for the order.
        Orders order3 = new Orders("Sabrina");
        Orders order4 = new Orders("Thomas");
        Orders order5 = new Orders("John");

        // Add at least 2 items to each of the orders using the addItem method you wrote, for example,
        // to add item1 to order3 you would need to call the addItem method from the order3 instance like so: order3.addItem(item1);

        order1.addItem(item4);
        order1.addItem(item4);

        order2.addItem(item1);
        order2.addItem(item2);

        order3.addItem(item4);
        order3.addItem(item3);

        order4.addItem(item2);
        order4.addItem(item3);

        order5.addItem(item1);
        order5.addItem(item3);
        order5.addItem(item3);

        // Test your getStatusMessage functionality by setting some orders to ready and printing the messages for each order.
        // For example: order2.setReady(true); System.out.println(order2.getStatusMessage());
        System.out.println("******TEST GETSTATUSMESSAGE******");
        order2.setReady(true);
        System.out.println(order2.getStatusMessage());
        System.out.println("-----------------------------------");


        // Test the total by printing the return value like so: System.out.println(order1.getOrderTotal());
        System.out.println("******TEST THE TOTAL******");
        System.out.println(order5.getOrderTotal());
        System.out.println("-----------------------------------");

        
        // Test the results and the display method by calling the display method on all of your orders, like so: order3.display();
        // Finally, call the display method on all of your orders, like so: order3.display();
        System.out.println("******TEST THE RESULTS AND THE DISPLAY METHOD ON ALL ORDERS******");
        order1.display();
        System.out.println("-------------");
        order2.display();
        System.out.println("-------------");
        order3.display();
        System.out.println("-------------");
        order4.display();
        System.out.println("-------------");
        order5.display();
        System.out.println("-----------------------------------");


        // TEST ALL METHODS
        
    }
}
















