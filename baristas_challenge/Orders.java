import java.util.ArrayList;

// Set the member variables to private instead of public.
// This time do not include the total member variable, as we will be using a method for getting the total.

public class Orders {

    // Private Member Variables:
    private String name; // default value of null
    private boolean ready; // default value of false
    private ArrayList<Items> items; // defaults to null

// -----------------------------------------------------------------------------------

    // Constructor:
    // Add a constructor to your Order class that takes no arguments,
    // but sets the name to "Guest" and initializes the items array to an empty ArrayList<Item>
    public Orders(){
        this.name = "Guest";
        this.items = new ArrayList<Items>();
    }

// -----------------------------------------------------------------------------------

    // Overloaded Constructor:
    // Add an overloaded constructor for Order that takes String name as an argument, so you can create an instance with a name.
    public Orders(String name){
        this.name = name;
        this.items = new ArrayList<Items>();
    }
    
// -----------------------------------------------------------------------------------

    // addItem
    // Create a method called addItem that takes an Item object as an argument and adds the item to the order's items array.
    // No need to return anything.
    public void addItem(Items item){
        items.add(item);
    }

// -----------------------------------------------------------------------------------

    // getStatusMessage
    // Create a method called getStatusMessage that returns a String message.
    // If the order is ready, return "Your order is ready.", if not, return "Thank you for waiting.
    // Your order will be ready soon."
    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready.";
        }
        return "Thank you for waiting, your order will be ready soon.";
    }

// -----------------------------------------------------------------------------------

    // getOrderTotal
    // Similar to the getOrderTotal method from the Cafe Business Logic assignment,
    // create a method called getOrderTotal that sums together each of the item's prices, and returns the total amount.
    // Note: This time, you do not need to pass in a list of prices, because each item object in this order's items array has its own price,
    // that you can access using a getter!

    // Implement the getOrderTotal method within the Order class
    public double getOrderTotal(){
        double total = 0;
        for(Items item : items){
            total += item.getPrice();
        }
        return total;
    }

// -----------------------------------------------------------------------------------

    // display
    // Similar to the displayMenu function from the Cafe Business Logic assignment,
    // create a method called display that prints out the order information like so:
    // Customer Name: Cindhuri
    // drip coffee - $1.50
    // capuccino - $3.50
    // Total: $5.00

    // Implement the display method within the Order class
    public void display(){
        System.out.println("Customer Name: " + this.name);
        for(Items item : items){
            System.out.println(item.getName()+" - $" + item.getPrice());
        }
        System.out.println("Total: $"+getOrderTotal());
    }
    
// -----------------------------------------------------------------------------------

    // Accessors & Mutators (Getters and Setters)
    // Create getters and setters for all the member variables, using good naming convention for boolean accessors.
    public String getName(){
        return this.name;
    }

// -----------------------------------------------------------------------------------

    public void setName(String name){
        this.name = name;
    }

// -----------------------------------------------------------------------------------

    public boolean getReady(){
        return this.ready;
    }

// -----------------------------------------------------------------------------------

    public void setReady(boolean ready){
        this.ready = ready;
    }

// -----------------------------------------------------------------------------------

    public ArrayList<Items> getItems(){
        return this.items;
    }

// -----------------------------------------------------------------------------------

    public void setItems(ArrayList<Items> items){
        this.items = items;
    }
}

