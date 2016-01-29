import java.util.Scanner;
/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

    /**
     * The main method in this class checks the Deck operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
        System.out.println();
        System.out.println("Deck 1");
        String[] ranks1 = {"A","B","C"};
        String[] suits1 = {"Red","Green","Blue"};
        int[] values1 = {1,2,3};
        Deck d1 = new Deck(ranks1, suits1, values1);
        System.out.println(d1); //toString test
        System.out.println("Deck size: " + d1.size());
        System.out.println("Deck is Empty? " + d1.isEmpty());
        System.out.println("Deal Card: " + d1.deal());
        
        System.out.println("Press enter to continue...");
        Scanner in = new Scanner(System.in);
        in.nextLine();
        System.out.print('\u000C');

        System.out.println();
        System.out.println("Deck 2");
        String[] ranks2 = {"Squire","Knight","Sage"};
        String[] suits2 = {"Camelot","Anglia","Heaven"};
        int[] values2 = {5,7,10};
        Deck d2 = new Deck(ranks2, suits2, values2);
        System.out.println("Deck size: " + d2.size());
        System.out.println("Deck is Empty? " + d2.isEmpty());
        System.out.println("Deal Card: " + d2.deal());
        System.out.println(d2); //toString test
        
        System.out.println("Press enter to continue...");
        in.nextLine();
        System.out.print('\u000C');
        
        System.out.println();
        System.out.println("Deck 3");
        String[] ranks3 = {"Squirrel","Kangaroo","Raven", "Wolf"};
        String[] suits3 = {"Africa","Jupiter","Narnia"};
        int[] values3 = {2,12,13,16};
        Deck d3 = new Deck(ranks3, suits3, values3);
        System.out.println("Deck size: " + d3.size());
        System.out.println("Deck is Empty? " + d3.isEmpty());
        for (int i = 0; i < ranks3.length * suits3.length; i++)
        System.out.println("Deal Card: " + d3.deal());
        System.out.println(d3); //toString test
        System.out.println("Deck is Empty? " + d3.isEmpty());
        
    }
}