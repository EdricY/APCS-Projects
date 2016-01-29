
/**
 * Write a description of class DiamondOutline here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DiamondOutline
{
   public static void main(String[] args) { 
    final int LENGTH = 11;
    int spaces = LENGTH-1;
    for (int i = 1; i <= LENGTH; i++) 
    {	
      for (int j = 1; j <= spaces; j++) 
        System.out.print(" "); 
        System.out.print("*");
      for(int k = 4; k <= 2*(LENGTH-spaces);k++)
      System.out.print(" "); 
      if(i != 1)
      System.out.print("*");
    System.out.println("");
           spaces--;
    }
     spaces++;
    for (int i = 2; i <= LENGTH; i++) 
    {	
      spaces++;
      
      for (int j = 1; j <= spaces; j++) 
        System.out.print(" "); 
        System.out.print("*");
      for(int k = 4; k <= 2*(LENGTH-spaces);k++)
        System.out.print(" "); 
      if(i != 11)
       System.out.print("*"); 
      System.out.println("");

    }
    
   }
}
