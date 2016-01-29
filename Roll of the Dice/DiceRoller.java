
/**
 * Write a description of class DiceRoller here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DiceRoller
{
    // instance variables - replace the example below with your own
    /**
     * Constructor for objects of class DiceRoller
     */
    public DiceRoller()
    {
        // initialise instance variables
    }

    private int dieRoll()
    {
        //gives the rsulting number from rolling 2 dice
        int die1 = (int) (Math.random() * 6) + 1;
        int die2 = (int) (Math.random() * 6) + 1;
        return die1 + die2;
    }
    public int[] recordData(int arraySize)
    {
        int[] data = new int[arraySize];
        for (int i = 0; i < arraySize; i++)
        {
            data[i] = dieRoll();
        }
        return data;
    }
    
    // method from stackoverflow.com from user corsiKa
    // edited to make sure the integer is also positive
    public boolean isPositiveInteger(String s) {
    try { 
        Integer.parseInt(s); 
    } catch(NumberFormatException e) { 
        return false; 
    }
    // only got here if we didn't return false
    if (Integer.parseInt(s) <= 0)
    {
        return false;
    }
    return true;
    }
    
    public int howManyNumbersInArray(int[] dataArray, int x)
    {
        int a = 0;
        for(int i = 0; i < dataArray.length; i++)
        {
            if (dataArray[i] == x) 
            a++;
        }
        return a;
    }
}
