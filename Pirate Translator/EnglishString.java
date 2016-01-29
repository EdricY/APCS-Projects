
/**
 * Write a description of class EnglishString here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnglishString
{
    String phrase;
    public EnglishString(String s)
    {
        phrase = s;
    }
    
    public boolean equals(EnglishString es)
    {
        if (this.translate().phrase.equals(es.translate().phrase))
            return true;
        return false;
    }
    
    public PirateString translate()
    {
        String str = this.phrase.trim();
        
        int loc = findKeyword(str, "hello", 0);
        while (loc >= 0)
        {
            str = replacePhrase(str, "ahoy", loc, loc + 5);
            loc = findKeyword(str, "hello", loc);
        }
        
        loc = findKeyword(str, "is that", 0);
        while (loc >= 0)
        {
            str = replacePhrase(str, "be that", loc, loc + 7);
            loc = findKeyword(str, "is that", loc);
        }
        
        loc = findKeyword(str, "sir", 0);
        while (loc >= 0)
        {
            str = replacePhrase(str, "matey", loc, loc + 3);
            loc = findKeyword(str, "sir", loc);
        }
        
        loc = findKeyword(str, "excuse me", 0);
        while (loc >= 0)
        {
            str = replacePhrase(str, "arrr", loc, loc + 9);
            loc = findKeyword(str, "excuse me", loc);
        }
        
        loc = findKeyword(str, "where is", 0);
        while (loc >= 0)
        {
            str = replacePhrase(str, "whar be", loc, loc + 8);
            loc = findKeyword(str, "where is", loc);
        }
        
        PirateString ps = new PirateString(str);
        return ps;
    }
     private int findKeyword(String statement, String goal,
            int startPos)
    {
        String s = statement.trim();
        // The only change to incorporate the startPos is in
        // the line below
        int psn = s.toLowerCase().indexOf(
                goal.toLowerCase(), startPos);
        int iteration = 0;

        // Refinement--make sure the goal isn't part of a
        // word
        while (psn >= 0)
        {
            // Find the string of length 1 before and after
            // the word
            String before = " ", after = " ";
            if (psn > 0)
            {
                before = s.substring(psn - 1, psn)
                        .toLowerCase();
            }
            if (psn + goal.length() < s.length())
            {
                after = s.substring(
                        psn + goal.length(),
                        psn + goal.length() + 1)
                        .toLowerCase();
            }
            iteration++;
            /* determine the values of psn, before, and after at this point in the method. */
            
            // If before and after aren't letters, we've
            // found the word
            if (((before.compareTo("a") < 0) || (before
                    .compareTo("z") > 0)) // before is not a
                                            // letter
                    && ((after.compareTo("a") < 0) || (after
                            .compareTo("z") > 0)))
            {
                return psn;
            }

            // The last position didn't work, so let's find
            // the next, if there is one.
            psn = s.indexOf(goal.toLowerCase(),
                    psn + 1);

        }

        return -1;
    }
    
    private String replacePhrase(String statement, String newPhrase, int begin, int end)
    {
        String str1 = statement.substring(0, begin);
        String str2 = statement.substring(end , statement.length());
        return str1 + newPhrase + str2;
    }
}
