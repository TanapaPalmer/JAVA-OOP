import java.util.ArrayList;

public class Orders {

    public ArrayList<Items> items = new ArrayList<Items>();

    // name of the customers
    public String name;

    // start with $0.00
    public double total;

    // boolean: True or False
    public boolean ready;
}