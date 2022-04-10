package application;

//Sharing Entity method
class NPC extends CharacterEntity
{
	final String DEFAULT_NPC_TYPE = "Warrior";
	final String DEFAULT_NPC_ENEMY_TYPE = "Normal";
	final String DEFAULT_NPC_NAME = "NPC";
	
	static enum NPCType {STANDARD, ELITE, BOSS}
	
	/*
	 * NPC_TYPE_ENEMY
	 * 
	 * 
	 */
	
	
	// DEFAULT NPC Constructor
	public NPC()
	{
//		type = DEFAULT_NPC_TYPE;
		name = DEFAULT_NPC_NAME;
		hp = DEFAULT_HP;
	}
	
	// Constructor with NPC Type
	public NPC(String newNPCType)
	{
//		npcType = newNPCType;
		name = DEFAULT_NPC_NAME;
	}
	
	// Constructor with NPC Type and Name
	public NPC(String newNPCType, String newNPCName)
	{
//		npcType = newNPCType;
		name = newNPCName;
	}
}