package cards;

/*
 * Deck class: Represents a collection of playing cards
 * provides methods to manipulate the deck such as creating, taking, combining, and sorting cards.
 */

public class Deck {

	private Card[] cards;
	private int numCards = 0; // number of cards in array

	// Creates a deck with each number from 0 to NUM-1 having all 4 suits
	public Deck(int num) {
		this.numCards = num * 4; // size of cars array (4 types *NUM).
		cards = new Card[numCards];

		for (int i = 0; i < num; i++) {
			cards[i * 4] = new Card(i, 0); // Clubs
			cards[i * 4 + 1] = new Card(i, 1); // Diamonds
			cards[i * 4 + 2] = new Card(i, 2); // Hearts
			cards[i * 4 + 3] = new Card(i, 3); // Spades
		}
	}

	// Create a deck by taking cards from an existing deck
	public Deck(Deck from, int num) {
		int sizeNewDeck = Math.min(from.getNumCards(), num); // in case cards to take > size of from
		this.cards = new Card[sizeNewDeck];
		for (int i = 0; i < sizeNewDeck; i++) {
			cards[i] = from.takeOne();
		}
		this.numCards = sizeNewDeck; // Set the correct number of cards
	}

	// Create a deck by combining two decks
	public Deck(Deck first, Deck second) {
		// size of new deck
		int sizeNewDeck = first.getNumCards() + second.getNumCards();
		this.cards = new Card[sizeNewDeck]; // create new deck

		int index = 0; // help to fill the deck
		// 1.check if we need to take more cards.
		// 2. before taking make sure it is not empty
		while ((first.getNumCards() > 0) || (second.getNumCards() > 0)) {
			if (first.getNumCards() > 0) {
				cards[index] = first.takeOne();
				index++;
			}

			if (second.getNumCards() > 0) {
				cards[index] = second.takeOne();
				index++;
			}
		}
		this.numCards = sizeNewDeck; // Set the correct number of cards
	}

	public int getNumCards() {
		return numCards;
	}

	// Method to take one card from the deck
	public Card takeOne() {
		if (numCards == 0) // empty deck
			return null;
		Card moveCard = cards[numCards - 1];
		cards[numCards - 1] = null;
		numCards--;
		return moveCard;

	}

	// Return a string representation of the deck
	public String toString() {
		String result = "["; // Start with an opening bracket

		// Loop through each card in the deck
		for (int i = 0; i < numCards; i++) {
			result += cards[i].toString(); // add the card
			// add the letter representation of the suit of the card
			// if not last card and ", "
			if (i < numCards - 1)
				result += ", ";
		}
		result += "]";
		return result;
	}

	// Sorts the deck in ascending order based on card values and suits.
	public void sort() {

		// outer loop: go through all cards (without last card.)
		for (int j = 0; j < numCards - 1; j++) {
			// inner loop: compare each card with the subsequent cards
			for (int i = j + 1; i < numCards; i++) {
				// if the current card is greater than the next card, bubble them
				if (cards[j].compareTo(cards[i]) > 0) {
					Card temp = cards[j];
					cards[j] = cards[i];
					cards[i] = temp;
				}
			}
		}
	}

}
