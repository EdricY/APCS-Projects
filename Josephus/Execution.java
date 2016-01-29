import java.util.ArrayList;
/**
 * Write a description of class Execution here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Execution
{
    int numPeople;
    int numSkip;
    ArrayList<Integer> people = new ArrayList<Integer>();
    
    public Execution(int numOfPeople, int skipNum)
    {
        numPeople = numOfPeople;
        numSkip = skipNum;
        for (int i = 1; i <= numPeople; i++)
        {
            people.add(i);
        }
    }
    public int execute()
    {        
        int count = 0;
        while (people.size() > 1)
        {
            for (int i = 0; i < people.size(); i++)
            {
                count++;
                if (count == numSkip)
                {
                  people.remove(i);
                  i--;
                  count = 0;
                }
            }
        }
        
        return people.get(0);
    }
    

}
