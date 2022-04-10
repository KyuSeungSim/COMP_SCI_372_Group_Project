package application;

abstract class Deck extends CharacterEntity {
	
	
	/**
	 * TODO - we should complete these
	 * should use java's built in arraylist functions to simplify all thisjunk
	 * consider using a Queue class to implement these functions
	 * the decks should be queues, where the cards are dequeued on draw
	 * any cards added between battles should be enqueued
	 * any cards added during battle should be shuffled in
	 */
	
	final int CARDS_MAX = 30;
	
	Card[] cards = new Card[CARDS_MAX]; //empty deck of cards

	/**
	 * TODO implement
	 * shuffles the deck. not sure of best means to do it yet
	 */
	public void shuffleDeck()
	{
		
	}
	
	
	/**
	 * TODO implement this
	 * @param card to shuffle into deck
	 * @return card that is being shuffled
	 */
	public Card shuffleInto(Card card) {
		
		
		return card;
	}

	/**
	 * TODO implement
	 * @param deck
	 * @return the card that's dequeued
	 */
	public Card drawCardTop(Deck deck)
	{
		return deck.cards[0];
	}

	/**
	 * TODO implement
	 * @param deck
	 * @return the card drawn from bottom. perhaps used to 
	 */
	public Card drawCardBottom(Deck deck)
	{
		return deck.cards[0];
	}
	
}
