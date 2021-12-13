/**
 * Model some details of a product sold by a company.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @author John McCormack
 * @version 2016.02.29
 */
public class Product
{
    // An identifying number for this product.
    private int id;
    // The name of this product.
    private String name;
    // The quantity of this product in stock.
    private int quantity;

    /**
     * Constructor for objects of class Product.
     * The initial stock quantity is zero.
     * @param id The product's identifying number.
     * @param name The product's name.
     */
    public Product(int id, String name)
    {
        this.id = id;
        this.name = name;
        
        quantity = 0;
    }

    /**
     * @return The product's id.
     */
    public int getID()
    {
        return id;
    }

    /**
     * @return The product's name.
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return The quantity in stock.
     */
    public int getQuantity()
    {
        return quantity;
    }

    /**
     * @set The quantity in stock.
     */
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    
    /**
     * @choose how much quantity to increase
     * in stock.
     */
    public void increaseQuantity(int amount)
    {
        quantity = quantity + amount;
    }
    
    /**
     * @choose how much quantity to decrease
     * in stock.
     */
    public void decreaseQuantity(int amount)
    {
        if(quantity >= amount)
            quantity = quantity - amount;
    }
    
    /**
     * @return The id, name and quantity in stock.
     */
    public String toString()
    {
        return " ID " + id + ": " +  name + " stock level: " + quantity;
    }

    
    public void print()
    {
        System.out.println(toString());
    }
}