package application;

//Sharing Entity method
class Player extends CharacterEntity
{
	final String DEFAULT_PLAYER_TYPE = "Warrior";
	final String DEFAULT_PLAYER_NAME = "USER";
	final int P_HP = DEFAULT_HP * 2; //i figured player might get more HP. maybe doubled
	final int P_SPEED = DEFAULT_SPEED * 2;
	
	String playerType;
	
	
//	String[] playerDeck;
//	String[] playerHand;
	
	Deck deck;

	// DEFAULT Constructor
	public Player()
	{
//		playerType = DEFAULT_PLAYER_TYPE;
		name = DEFAULT_PLAYER_NAME;
	}
	
	// Constructor with Player Type
	public Player(String userType)
	{
//		characterType = userType;
		name = DEFAULT_PLAYER_NAME;
		hp = DEFAULT_HP;
	}
	
	// Constructor with Player Type and Name
	public Player(String userType, String userName)
	{
//		characterType = userType;
//		playerName = userName;
	}
	
}