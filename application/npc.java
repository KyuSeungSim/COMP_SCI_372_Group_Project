package application;

//Sharing Entity method
class npc extends characterEntity
{
	final String DEFAULT_NPC_TYPE = "Warrior";
	final String DEFAULT_NPC_ENEMY_TYPE = "Normal";
	final String DEFAULT_NPC_NAME = "NPC";
	
	
	String npcType;
	String npcName;
	
	/*
	 * NPC_TYPE_ENEMY
	 * 
	 * 
	 */
	
	
	// DEFAULT NPC Constructor
	public npc()
	{
		npcType = DEFAULT_NPC_TYPE;
		npcName = DEFAULT_NPC_NAME;
		hp = DEFAULT_HP;
	}
	
	// Constructor with NPC Type
	public npc(String newNPCType)
	{
		npcType = newNPCType;
		npcName = DEFAULT_NPC_NAME;
	}
	
	// Constructor with NPC Type and Name
	public npc(String newNPCType, String newNPCName)
	{
		npcType = newNPCType;
		npcName = newNPCName;
	}
	
	public String getNPCName()
	{
		return npcName;
	}
		
		
		// FIXME: GUI Controller in here

	public void shuffleDeck()
	{
		
	}
	
	public int drawCard()
	{
		return 0;
	}
}