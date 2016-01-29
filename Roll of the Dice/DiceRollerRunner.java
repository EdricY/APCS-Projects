import java.util.Scanner;
/**
 * Write a description of class DiceRollerRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DiceRollerRunner
{
    public static void main(String[] args)
    {
        DiceRoller roller = new DiceRoller();
        Scanner in = new Scanner (System.in);
        System.out.println ("How many times should I roll the dice?");
        String trials = in.nextLine().trim();
        while(!(roller.isPositiveInteger(trials)))
        {
            System.out.println ("Enter a positive integer, please.");
            trials = in.nextLine().trim();
        }
       
        System.out.println ("Trials: " + trials);
        int[] diceResults = roller.recordData(Integer.parseInt(trials));
        
        
        int[] numberOfResults = new int[11];
        for (int i = 0; i < 11; i++)
        {
            numberOfResults[i] = roller.howManyNumbersInArray(diceResults,i+2);
        }
        
        int max = 0;
        for(int i = 0; i < numberOfResults.length; i++)
            {
                if (numberOfResults[i] > max)
                   max = numberOfResults[i];
            }
            
        //printing
        System.out.println(" --------------------------------------------------------");
        for(int i = 0; i < 20; i++)
        {
            System.out.print("|");
            for(int j = 0; j < numberOfResults.length; j++)
            {
                if (numberOfResults[j] >= max * (1-(.05*i)))
                System.out.print("  *  ");
                else
                System.out.print("     ");
            }
            System.out.print("|");
            System.out.println("");
            
        }
        System.out.println(" --2----3----4----5----6----7----8----9----10---11---12--");
    }
}
