package application;


// Entire class Entity
public abstract class CharacterEntity extends Game
{
	final int DEFAULT_HP = 10;
	final int DEFAULT_SPEED = 3;
	final int DEFAULT_MAX_HP = 20;
	final int DEFAULT_MAX_SPEED = 9;

	public enum Type {PLAYER, NPC}
	String name; //unique name for this NPC or player
	int hp;
	int speed;
	Deck deck;
	Hand hand;

	Card selectedCard = null;
	
	//TODO figure out how enums work across abstracts
	private Type Type;	
	
	public Type getType() {return this.Type;}
	
	public String getName() {return this.name;}
	public int getHP() {return this.hp;}
	public int getSpeed() {return this.speed;}
	
	//TODO do the following:
	/**
	 * add maxes and mins for the following
	 */
	public void addHP(int newHP) {
		this.hp += newHP;
	}
	public void subtractHP(int newHP) {
		this.hp -= newHP;
	}
	
	public void addSpeed(int newSpeed) {
		this.speed += newSpeed;
	}
	public void subtractSpeed(int newSpeed) {
		this.speed -= newSpeed;
	}
	
	//TODO implement following functions, test, andadd comments to clarify
	//		how functions will be performed
	
	
	public void swapDeck(Deck deck)
	{
		
	}
	
	public void shuffleDeck()
	{
		
	}
	
	public int addCardDeck(int addCard)
	{
		return 0;
	}
	
	public void discardCard(int discard)
	{
		
	}
	
	public int discardHand()
	{
		
		return 0;
	}
	
	//TODO this might want to utilize radio buttons and enums
	//		for clarity and ensure valid inputs
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
