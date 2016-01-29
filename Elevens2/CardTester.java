/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1= new Card("ace","spades",1);
		Card card2 = new Card("king","hearts",12);
		Card card3 = new Card("ace","spades",1);
		
		System.out.println("card1 suit is " + card1.suit());
		System.out.println("card1 rank is " + card1.rank());
		System.out.println("card1 point value is " + card1.pointValue());
		System.out.println(card1.toString());
		System.out.println();
		
		System.out.println("card2 suit is " + card2.suit());
		System.out.println("card2 rank is " + card2.rank());
		System.out.println("card2 point value is " + card2.pointValue());
		System.out.println(card2.toString());
		System.out.println();
		
		System.out.println("card3 suit is " + card3.suit());
		System.out.println("card3 rank is " + card3.rank());
		System.out.println("card3 point value is " + card3.pointValue());
		System.out.println(card3.toString());
		System.out.println();
		
		System.out.print("card1 matches card2 : ");
		System.out.println(card1.matches(card2));
		System.out.print("card2 matches card3 : ");
		System.out.println(card2.matches(card3));
		System.out.print("card1 matches card3 : ");
		System.out.println(card3.matches(card1));
		
		
	}
}