
/**
 * Write a description of class Diamond here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Diamond
{
   public static void main(String[] args) { 
    final int LENGTH = 11;
    int spaces = LENGTH-1;
    int stars = 1;

    for (int i = 1; i <= LENGTH; i++) 
    {	
      for (int j = 1; j <= spaces; j++) 
        System.out.print(" "); 
      for (int j = 1; j <= stars; j++) 
        System.out.print("*"); 
    System.out.println("");
           stars+= 2;
           spaces--;
    }
     spaces++;
     stars-=2;
    for (int i = 2; i <= LENGTH; i++) 
    {	
      spaces++;
      stars-=2;
      for (int j = 1; j <= spaces; j++) 
        System.out.print(" "); 
      for (int j = 1; j <= stars; j++) 
        System.out.print("*"); 
      System.out.println("");

    }
    
   }
}
