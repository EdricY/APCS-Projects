/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (statement.trim().equals(""))
        {
            response = "Say something.";
        }
        else if (statement.indexOf("no") >= 0
                || statement.indexOf("No") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf("cat") >= 0 
                || statement.indexOf("dog") >= 0)
        {
                response = "Tell me more about your pets.";
        }
        else if (statement.indexOf("Mr. Miller") >= 0
                || statement.indexOf("mr. miller") >= 0)
        {
                response = "He sounds like a cool guy.";      
        }
        else if (statement.indexOf("Obama") >= 0
                || statement.indexOf("president") >= 0
                || statement.indexOf("President") >= 0)
        {
                response = "Please wait while I contact the FBI.";      
        }
        else if (statement.indexOf("love") >= 0
                || statement.indexOf("Love") >= 0)
        {
                response = "What is love?";      
        }

        else
        {
            response = getRandomResponse();
        }
        
        for (int i = 0; i <= 9; i++)
        {
            if (statement.indexOf(Integer.toString(i)) >= 0)
                response = "I'm not very good at math.";
        }
        

        
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Continue.";
        }
        else if (whichResponse == 5)
        {
            response = "Curious, go on.";
        }
        

        return response;
    }
}
