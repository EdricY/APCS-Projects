
/**
 * Write a description of class UnitTests here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UnitTests
{
    public static void main(String[] args)
    {
        System.out.println();
        System.out.println(
        "With 6 people, killing every 2nd person will result in the survivor standing in position 5.");
        Execution ex = new Execution(6,2);
        System.out.println("And the result is " + ex.execute() + ".");
        System.out.println();
        System.out.println(
        "With 7 people, killing every 3rd person will result in the survivor standing in position 4.");
        ex = new Execution(7,3);
        System.out.println("And the result is " + ex.execute() + ".");
        System.out.println();
        System.out.println(
        "With 10 people, killing every 4th person will result in the survivor standing in position 5.");
        ex = new Execution(10,4);
        System.out.println("And the result is " + ex.execute() + ".");
    }
}
