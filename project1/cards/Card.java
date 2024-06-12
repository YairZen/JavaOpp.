package cards;

/*
 * Card class: Represents playing cards
 * and provides methods to access card information and compare cards.
 */

public class Card {

	private int num;
	private int suit;

	public Card(int num, int suit) {
		this.num = num;
		this.suit = suit;
	}

	public int getNum() {
		return num;
	}

	public int getSuit() {
		return suit;
	}

	// Return a string representation of the card
	public String toString() {
		String[] suits = { "C", "D", "H", "S" };
		String suitString = suits[suit];
		return num + suitString;
	}

	// Method to compare this card with another card
	public int compareTo(Card other) {
		if (num == other.getNum())
			return suit - other.getSuit(); // Compare by suit if this is =/>/<
		else
			return num - other.getNum(); // Compare by number if this is =/>/<
	}
}
