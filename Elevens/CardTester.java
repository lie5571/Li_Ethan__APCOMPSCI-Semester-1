public class CardTester {
	
	public static void main(String[] args) {
		
		Card card1 = new Card("Heart", "9", 9);
		Card card2 = new Card("Diamond", "5", 5);
		Card card3 = new Card("Heart", "Jack", 11);
		System.out.println("Card 1: " + card1.toString());
		System.out.println("Card 2: " + card2.toString());
		System.out.println("Card 3: " + card3.toString());
		System.out.println("Card 1 != Card 2 || Card 3 " + (!card2.matches(card1) && !card2.matches(card3)));
	}
}