public class Card {

	private String suit;
	private String rank;
	private int pointValue;

	public Card(String suit, String rank, int pointValue) {
		this.suit = suit;
		this.rank = rank;
		this.pointValue = pointValue;
	}

	public String getSuit() {
		return suit;
	}

	public String getRank() {
		return rank;
	}

	public int getPointValue() {
		return pointValue;
	}

	public boolean matches(Card otherCard) {
		return otherCard.getSuit().equals(this.getSuit()) && otherCard.getRank().equals(this.getRank()) && otherCard.getPointValue() == this.getPointValue();
	}

	@Override
	public String toString() {
		return suit + " of " + rank + " (point value :: " + pointValue + ")";
	}
}
