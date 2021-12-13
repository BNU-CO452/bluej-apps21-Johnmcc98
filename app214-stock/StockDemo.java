import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @author John McCormack
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;
    
    private Random random;


    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();
        this.random = new Random();
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Red Dead Redemption 2"));
        stock.add(new Product(102, "Granblue Fantasy Versus"));
        stock.add(new Product(103, "Demon Slayer The Hinokami Chronicles"));
        stock.add(new Product(104, "First Class Trouble"));
        stock.add(new Product(105, "Guilty Gear Strive"));
        stock.add(new Product(106, "Blazblue Centralfiction"));
        stock.add(new Product(107, "Elden Ring"));
        stock.add(new Product(108, "Bloodborne"));
        stock.add(new Product(109, "Dark Souls 3"));
        stock.add(new Product(110, "Genshin Impact"));
        
        runDemo();
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();
        
        findProducts();
        stock.print();
        
        removeProducts();
        stock.print();
        
        checkstockProducts();
        stock.print();
    }
    
    private void buyProducts()
    {
        for(int i = 101; i < 110; i++)
    {
        stock.buyProduct(i, random.nextInt(1001));
    }
    }

    private void sellProducts()
    {
        for(int i = 101; i < 110; i++)
    {
        stock.sellProduct(i, random.nextInt(1001));
    }
    } 
    
     private void removeProducts()
    {
    {
        System.out.println("Product 106 has been removed");
        stock.removeProducts(106);
    }
    } 
    
     private void findProducts()
    {
    {
        System.out.println("Search for game by name");
        stock.findName("Red Dead Redemption 2");
    }
    } 
    
     private void checkstockProducts()
    {
       for(int i = 101; i < 110; i++)
    {
        stock.checkstockProducts(i);
    }
    } 
}