package application;

class Discard extends CharacterEntity{
	
	/**
	 * TODO - these should be completed, probably. i guess.iuhhhuh
	 * use java's built-in array list functions
	 * the cards here should be in a Stack, since some card functions may pop discarded cards from the top
	 */
	final int MAX_CARDS = 100; //not sure if there's a reason to have a cap butsure
	/**
	 * only function i can think that the discard needs is to clear the discard pile upon exiting battle,
	 * or special functions called by cards that are played
	 */
	
	Card[] discards = new Card[MAX_CARDS];
	
	/**
	 * TODO implement this function; might be necessary to make a class to hold 
	 * 			these cards as a stack for push and pop operations
	 * @param deck - the deck to draw from
	 * @return
	 */
	public Card draw (Deck deck) {
		return discards[0];
	}
	
}
