package model;

/**
 * 
 * @author Luc
 *
 */

public class Tool {
	/**
	 * Class variables
	 */
	public int toolID;
	public String toolName;
	
	/**
	 * Class constructor, creates a tool instance with an ID and a name.
	 * 
	 * @param toolIDArg	Id of the tool
	 * @param toolNameArg name of the tool
	 */
	public Tool(int toolIDArg, String toolNameArg) {
		toolID = toolIDArg;
		toolName = toolNameArg;
	}
}
