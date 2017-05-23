public class DeckTester {
	public static void main(String[] args) {
		String[] rank1 = {"Jack", "Queen", "King"};
		String[] suit1 = {"Hearts", "Clubs", "Diamonds"};
		int[] value1 = {11, 12, 13};
	    Deck d1 = new Deck(rank1, suit1, value1);
		System.out.println(d1);
	    System.out.println("Deck1 size is 9 " + d1.size());
	    String[] rank2 = {"10", "Queen", "King"};
	    String[] suit2 = {"Clubs", "Spades", "Hearts"};
	    int[] value2 = {10, 12, 13};
	    Deck d2 = new Deck(rank2, suit2, value2);
		System.out.println(d2);
	    System.out.println("Deck2 is not empty " + !d2.isEmpty());
	    String[] rank3 = {"1", "3", "Queen"};
	    String[] suit3 = {"Diamonds", "Spades", "Clubs"};
	    int[] value3 = {1, 3, 12};
	    Deck d3 = new Deck(rank3, suit3, value3);
		System.out.println(d3);
	    System.out.println("Deck3 dealt card " + d3.deal());
	}
}