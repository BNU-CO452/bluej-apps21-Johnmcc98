
/**
 * This class is a model of a module which forms part of a BNU course.
 *
 * @author John McCormack
 * @version (a version number or a date)
 */
public class Module
{
    // instance variables 
    private String Code;
    private String Title;
    private int Credit;
    /**
     * Constructor for objects of class Module
     */
    public Module(String Code, String Title)
    {
       // initialise instance variables
       this.Code = Code;
       this.Title = Title;
       Credit = 0;
    }
    
    /**
     * Return the instance of the module code.
     */
    public String getCode()
    {
        //
        return this.Code;
    }
    
    /**
     * Return the instance of the module title.
     */
    public String getTitle()
    {
        //
        return this.Title;
    }
    
    /**
     * Return the instance of the credit value.
     */
    public int getCredit()
    {
        //
        return this.Credit;
    }
    
    /**
     * Allows the user to set the credit of the module.
     */
    public void setCredit(int Credit)
    {
        //
        this.Credit = Credit;
    }
    
    /**
     * Print the details of the module including the module code, title and the credit score.
     */
    public void print()
    {
        //printHeading();
        
        System.out.println(" Module Code: " + Code + ": " + Title  +  " Credit Score:  " + Credit);
        System.out.println();
    }
    
    
}
