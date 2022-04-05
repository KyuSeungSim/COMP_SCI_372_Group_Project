package application;


// Entire class Entity
public abstract class characterEntity 
{
	final int DEFAULT_HP = 10;
	final int DEFAULT_SPEED = 3;

	String characterType; // Character Type is warrior? Magician? healer?
	String characterName;
	int hp;
	int speed;
	
	// FIXED: Make it array or list
	int deck;
	int hand;
	
	int selectCard;
	int currentCard;	
	
	public int modifyDeck()
	{
		return 0;
	}
	
	public void suffleDeck()
	{
		
	}
	
	public int addCardDeck(int addCard)
	{
		return 0;
	}
	
	public void discardCard(int disCard)
	{
		
	}
	
	public int discardHand()
	{
		return 0;
	}
	
	public int selectCharacterType(int typeNumber)
	{
		if(typeNumber == 1)
		{
			// 1 is Warrior
			return 1;
		}
		else if(typeNumber == 2)
		{
			// 2 is Magician
			return 2;
		}
		else
		{
			System.out.println("Character Type is wrong");
			return 0;
		}	
	}
	
	
	
	
}
