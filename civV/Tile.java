
/**
 * Write a description of class Tile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tile
{
    // instance variables - replace the example below with your own
    boolean isWorkable;
    Resource f;
    Resource p;
    Resource g;

    /**
     * Constructor for objects of class Tile
     */
    public Tile(boolean isWorkable, int foodAmt, int productionAmt, int goldAmt)
    {
        // initialise instance variables
        this.isWorkable = isWorkable;
        f = new Food(foodAmt);
        p = new Production(productionAmt);
        g = new Gold(goldAmt);
    }
    public int getFoodAmt(){return f.getAmount();}
    public int getProductionAmt(){return p.getAmount();}
    public int getGoldAmt(){return g.getAmount();}
    public boolean IsWorkable(){return isWorkable;}
}
