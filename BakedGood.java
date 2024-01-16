
/**
 * Represents a single baked good in our bakery inventory.
 *
 * @author (Sarah)
 * @version (1.16.24)
 */

public class BakedGood
{
    // instance variables
    private String name;
    private String recipe;
    private double price;
    private int quantity;

    /**
     * Constructor for objects of class BakedGood
     */
    public BakedGood(String name, String recipe, double price, int quantity)
    {
        // initialise instance variables
        this.name = name;
        this.recipe = recipe;
        this.price = price;
        this.quantity = quantity;
    }
    
    // modify quantity
    public void increaseQuantity(int count) {
        this.quantity += count;
    }
    
    // toString
    public String toString() {
        return "baked good: " + this.name + " (" + this.quantity + " @ $" + this.price + ")";
    }
    
    public static void main(String[] args) {
        BakedGood croissant = new BakedGood("croissant", "butter, flour, laminate, yum", 20.0, 0);
        
        //bake a dozen croissants
        croissant.increaseQuantity(12);
        System.out.println(croissant);
        
        croissant.increaseQuantity(3);
        System.out.println(croissant);
    }
}
