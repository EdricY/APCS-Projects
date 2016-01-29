
/**
 * Write a description of class Resource here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Resource
{
    // instance variables - replace the example below with your own
    private int amount;

    /**
     * Constructor for objects of class Resource
     */
    public Resource(int amount)
    {
        this.amount = amount;
    }
    public int getAmount(){return amount;}
}
