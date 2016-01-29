
/**
 * Write a description of class Settlement here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Settlement
{
    // instance variables - replace the example below with your own
    Tile[][] cityRadius;
    boolean[][] working;
    Tile cityTile;
    int population;

    /**
     * Constructor for objects of class Settlement
     */
    public Settlement(int pop, Tile city, Tile[][] hexes, boolean[][] workingTiles)
    {
        // initialise instance variables
        population = pop;
        working = workingTiles;
        cityRadius = hexes;
        cityTile = city;
    }
    public int getFood()
    {
        int total = 0;
        for (int r = 0; r < cityRadius.length; r++)
            for (int c = 0; c < cityRadius[0].length; c++)
                if (cityRadius[r][c] != null && cityRadius[r][c].IsWorkable() == true && working[r][c] == true)
                total += cityRadius[r][c].getFoodAmt();
        
        return total + cityTile.getFoodAmt();
    }
    public int getProduction()
    {
        int total = 0;
        for (int r = 0; r < cityRadius.length; r++)
            for (int c = 0; c < cityRadius[0].length; c++)
                if(cityRadius[r][c] != null && cityRadius[r][c].IsWorkable() == true && working[r][c] == true)
                total += cityRadius[r][c].getProductionAmt();
        
        return total + cityTile.getProductionAmt();
    }
    public int getGold()
    {
        int total = 0;
        for (int r = 0; r < cityRadius.length; r++)
            for (int c = 0; c < cityRadius[0].length; c++)
                if(cityRadius[r][c] != null && cityRadius[r][c].IsWorkable() == true && working[r][c] == true)
                total += cityRadius[r][c].getGoldAmt();
        
        return total + cityTile.getGoldAmt();
    }
}
