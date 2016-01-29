import java.util.Scanner;
/**
 * Write a description of class JosephusRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JosephusRunner
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println();
        System.out.println("How many people?");
        String input = in.nextLine();
        while(!(isPositiveInteger(input)))
        {
            System.out.println ("Enter a positive integer, please.");
            input = in.nextLine().trim();
        }
        int people = Integer.parseInt(input);
        
        System.out.println("Skip how many people each time?");
        input = in.nextLine();
        while(!(isPositiveInteger(input)))
        {
            System.out.println ("Enter a positive integer, please.");
            input = in.nextLine().trim();
        }
        int skip = Integer.parseInt(input);
        Execution ex = new Execution(people,skip);
        System.out.println(
        "If you wish to be the last one standing you should stand at spot number " + 
        ex.execute() + ".");
        
    }

    // method from stackoverflow.com from user corsiKa
    // edited to make sure the integer is also positive
    private static boolean isPositiveInteger(String s) {
       try  { 
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
     
}
