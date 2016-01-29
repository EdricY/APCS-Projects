
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
    int citySize;

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
        citySize = 0;
        for (int r = 0; r < cityRadius.length; r++)
            for (int c = 0; c < cityRadius[0].length; c++)        
                if(cityRadius[r][c] != null)
                    citySize++;
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
    public int maxFood()
    {
        int[] foodValues = new int[36]; //empty array
        int[] idValues = new int[36];   //empty array
        int i = 0;
        int workingPop = 0;
        int r = 0, c = 0;
        //fill idValues
        for (r = 0; r < cityRadius.length; r++)
        for (c = 0; c < cityRadius[0].length; c++)
        {
            if (cityRadius[r][c] != null)
            {
                idValues[i] = cityRadius[r][c].getId();
                i++;
            }
        }
        //fill foodValues
        for (r = 0; r < cityRadius.length; r++)
        for (c = 0; c < cityRadius[0].length; c++)
        {
            if (cityRadius[r][c] != null)
            foodValues[cityRadius[r][c].getId()-2] = cityRadius[r][c].getFoodAmt();
        }
        
        selectionSort(foodValues, idValues);
        
        //reset working values to false
        for (r = 0; r < cityRadius.length; r++)
        for (c = 0; c < cityRadius[0].length; c++)
        { 
             working[r][c] = false;
        }
        
        //reassign working values
        i = 0;
        while (workingPop < population && workingPop < citySize)
        {
            r = search2DArray(idValues[i])[0];
            c = search2DArray(idValues[i])[1];
            if (cityRadius[r][c].IsWorkable() == true)
            {
            working[r][c] = true;
            workingPop++;
            }
            i++;
        }     
       return this.getFood();
    }
    public int maxProduction()
    {
        int[] productionValues = new int[36]; //empty array
        int[] idValues = new int[36];   //empty array
        int i = 0;
        int workingPop = 0;
        int r = 0, c = 0;
        //fill idValues
        for (r = 0; r < cityRadius.length; r++)
        for (c = 0; c < cityRadius[0].length; c++)
        {
            if (cityRadius[r][c] != null)
            {
                idValues[i] = cityRadius[r][c].getId();
                i++;
            }
        }
        //fill goldValues
        for (r = 0; r < cityRadius.length; r++)
        for (c = 0; c < cityRadius[0].length; c++)
        {
            if (cityRadius[r][c] != null)
            productionValues[cityRadius[r][c].getId()-2] = cityRadius[r][c].getProductionAmt();
        }
        
        selectionSort(productionValues, idValues);
        
        //reset working values to false
        for (r = 0; r < cityRadius.length; r++)
        for (c = 0; c < cityRadius[0].length; c++)
        { 
             working[r][c] = false;
        }
        
        //reassign working values
        i = 0;
        while (workingPop < population && workingPop < citySize)
        {
            r = search2DArray(idValues[i])[0];
            c = search2DArray(idValues[i])[1];
            if (cityRadius[r][c].IsWorkable() == true)
            {
            working[r][c] = true;
            workingPop++;
            }
            i++;
        }
       return this.getProduction();
    }
    public int maxGold()
    {
        int[] goldValues = new int[36]; //empty array
        int[] idValues = new int[36];   //empty array
        int i = 0;
        int workingPop = 0;
        int r = 0, c = 0;
        //fill idValues
        for (r = 0; r < cityRadius.length; r++)
        for (c = 0; c < cityRadius[0].length; c++)
        {
            if (cityRadius[r][c] != null)
            {
                idValues[i] = cityRadius[r][c].getId();
                i++;
            }
        }
        //fill goldValues
        for (r = 0; r < cityRadius.length; r++)
        for (c = 0; c < cityRadius[0].length; c++)
        {
            if (cityRadius[r][c] != null)
            goldValues[cityRadius[r][c].getId()-2] = cityRadius[r][c].getGoldAmt();
        }
        
        selectionSort(goldValues, idValues);
        
        //reset working values to false
        for (r = 0; r < cityRadius.length; r++)
        for (c = 0; c < cityRadius[0].length; c++)
        { 
             working[r][c] = false;
        }
        
        //reassign working values
        i = 0;
        while (workingPop < population && workingPop < citySize)
        {
            r = search2DArray(idValues[i])[0];
            c = search2DArray(idValues[i])[1];
            if (cityRadius[r][c].IsWorkable() == true)
            {
            working[r][c] = true;
            workingPop++;
            }
            i++;
        }
       return this.getGold();
    }
          
    public void selectionSort(int[] a, int[] ids)
    {
        int maxPos, max;
        for (int i=0; i<a.length-1; i++)
        {
            max = a[i];
            maxPos = i;
            for (int j=i+1; j<a.length; j++)
            if (max < a[j])
            {
                max = a[j];
                maxPos = j;
            }
            swap(a, i, maxPos);
            swap(ids, i, maxPos);
        }
    }
          
    public void swap(int[]a, int i, int j)
    {
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
    public int[] search2DArray(int idValue)
    {
        int r = 0, c = 0;
        for (r = 0; r < cityRadius.length; r++)
        for (c = 0; c < cityRadius[0].length; c++)
        {
            if (cityRadius[r][c] != null && cityRadius[r][c].getId() == idValue)
            {
                return new int[]{r,c};
            }
        }
        return new int[0]; // this line should never be reached.
    }
}
