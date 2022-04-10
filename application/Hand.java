package application;

class Hand extends CharacterEntity
{
	final int HAND_MAX = 6;
	
	Card[] hand = new Card[HAND_MAX];
	Card cardSelected;
	
	/**
	 * TODO implement/test this, add graphics and stuff to hand
	 * 
	 * @param card - to add to hand
	 * @return handslot position of card that is added. idk why youd want returned, maybe VOID it
	 */
	public int add (Card card) {
		for (int i = 0; i < HAND_MAX; i++) {
			if (hand[i] == null) { //this slot is empty, place here
				hand[i] = card;
				return i;
			}
		}
		deselect();
		return -1; //all handslots are full
	}
	
	/**
	 * TODO implement
	 * @param card - the card to replace
	 * @param handSlot - position of card to be replaced
	 * @return - replacing card
	 */
	public Card replace (Card card, int handSlot) {
		Card replacedCard = hand[handSlot];
		hand[handSlot] = card;
		return replacedCard;
	}
	
	/**
	 * TODO implement
	 * @param card - to discard
	 */
	public void discard(int handSlot) {
		hand[handSlot] = null;
		deselect();
	}
	
	/**
	 * TODO implement
	 * selects card with provided handslot
	 * @param cardPosition
	 * @return - the card in this position of their hand
	 */
	public Card select(int handSlot) {
		//the given handslot/cardslot/position doesn't hold a card (invalid position or empty
		if (hand[handSlot] == null) {
			return null;
		}
		
		return hand[handSlot];
	}
	
	/**
	 * TODO implement
	 * updates GUI image, description, and stats of the SELECTION area of player's inventory
	 * @return
	 */
	public Card getSelection(Card card) {
		
		return cardSelected;
	}
	
	/**
	 * TODO implement
	 * deselects currently selected card, nullifying it
	 */
	public void deselect () {
		cardSelected = null;
	}
	
	
}