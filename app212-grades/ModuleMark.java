
/**
 * Write a description of class ModuleMark here.
 *
 * @author Derek Peacock and Nicholas Day
 * @author John McCormack
 * @version 2021-08-18
 */
public class ModuleMark
{
    private int mark;
    private Module module;
    
    /**
     * Constructor for objects of class ModuleMark
     */
    public ModuleMark(Module module)
    {
        mark = 0;
        this.module = module;
    }
    
    /**
     * gets the value for the mark entered
     */
    public int getValue()
    {
        return mark;
    }
    
    /**
     * If the mark is 40% or more then the 
     * student is awarded the module's credit.
     */
    public int getCredit()
    {
        if(mark <= Grades.F.getValue())
        {
            return 0;
        }
        else
        {
            return Module.CREDIT;
        }
    }
    
    /**
     * sets the mark for the entered mark
     */
    public void setMark(int mark)
    {
        this.mark = mark;
    }
    
    /**
     * returns te module for mark entered
     */
    public Module getModule()
    {
        return module;
    }
    
    /**
     * Print the module details and any credit
     * that has been awarded.
     */
    public void print()
    {
        module.print();
        System.out.print("\t  " + getCredit() + "\t" + mark);
    }
}
