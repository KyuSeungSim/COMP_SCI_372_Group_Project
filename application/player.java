package application;

//Sharing Entity method
class player extends characterEntity
{
	final String DEFAULT_PLAYER_TYPE = "Warrior";
	final String DEFAULT_PLAYER_NAME = "USER";
	
	
	String playerType;
	String playerName;
	
	
	String[] playerDeck;
	String[] playerHand;

	// DEFAULT Constructor
	public player()
	{
		characterType = DEFAULT_PLAYER_TYPE;
		playerName = DEFAULT_PLAYER_NAME;
	}
	
	// Constructor with Player Type
	public player(String userType)
	{
		characterType = userType;
		playerName = DEFAULT_PLAYER_NAME;
		hp = DEFAULT_HP;
	}
	
	// Constructor with Player Type and Name
	public player(String userType, String userName)
	{
		characterType = userType;
		playerName = userName;
	}
	
	public String getPlayerName()
	{
		return playerName;
	}
	
	
	// FIXME: GUI Controller in here
}