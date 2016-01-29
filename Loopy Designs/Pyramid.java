
/**
 * Write a description of class Pyramid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pyramid
{
   public static void main(String[] args) { 
    final int LENGTH = 11;
    int x = 0;

    for (int i = 1; i <= LENGTH; i++) 
    {	
      for (int j = 1; j <= LENGTH; j++) 
      {
          if (j >= 11-x)
          System.out.print("*");
          else
          System.out.print(" "); 
      }
      for (int j = 1; j <= i-1; j++) 
      {
        System.out.print("*"); 
      }
    System.out.println("");
    x++;
    }
   }
}
