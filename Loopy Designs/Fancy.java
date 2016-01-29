
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fancy
{
    public static void main(String[] args)
    {
    int LENGTH = 10;
    double factor = 1.1;
    int max = 0; 
    int x = 0;
    for (double j = 1; j <= LENGTH; j*=factor) 
     {  
        max++;
     }
    for (int i = 1; i <= LENGTH; i++) 
    {   
        x=0;
            for (double j = i; j <= LENGTH; j*=factor) 
               {  
                 x++;
               }
               
        printSetOpposite(" ",x,max);
        printSet("*", x);
        printSet("*", x);

        System.out.println("");
    }
    for (int i = 1; i <= LENGTH; i++) 
    {   
        x=0;
        
        if( i !=LENGTH)
           for (double j = LENGTH-i; j <= LENGTH; j*=factor) 
           {    
                x++;
           }
      printSetOpposite(" ", x, max);
      printSet("*", x);
      printSet("*", x);
             
        System.out.println("");
    }
    }
    
    private static void printSet(String s, int x)
    {
        for (double j = 1; j <= x; j++) 
             {  
                System.out.print(s);
             }
    }
    private static void printSetOpposite(String s, int x, int max)
    {
        for (double j = 1; j <= max-x; j++) 
             {  
                System.out.print(s);
             }
    }
}
