package application;

abstract class Card extends Deck 
{
//	final int DEFAULT_MAX_CARD_NUM = 10;
//	final int DEFAULT_TOTAL_CARD = 20;
	final String DEFAULT_NAME = "<no card name>";
	
	static enum cardType {SPAWN, INSTANT}
	String name = DEFAULT_NAME;
	String imageStr = "";
	
	/**
	 * idk the correct string format for this yet
	 * @return the correct image string used to update the GUI images
	 */
	public String getImage() {
		return String.format("/%s", imageStr);
	}
	
//	String[] warriorDeck;
//	String[] magicianDeck;
//	
//	int totalCards;
//	int maxNumCards;
//	
//	String[] attackCards;
//	String[] defenseCards;
//	String[] magicCards;
//	String[] healCards;
	
	
	
	

}
