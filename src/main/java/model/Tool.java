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
	private int toolID;
	private String toolName;
	
	/**
	 * Class constructor, creates a tool instance with an ID and a name.
	 * 
	 * @param toolIDArg	Id of the tool
	 * @param toolNameArg name of the tool
	 */
	public Tool(int toolIDArg, String toolNameArg) {
		setToolID(toolIDArg);
		setToolName(toolNameArg);
	}

	public int getToolID() {
		return toolID;
	}

	public void setToolID(int toolID) {
		this.toolID = toolID;
	}

	public String getToolName() {
		return toolName;
	}

	public void setToolName(String toolName) {
		this.toolName = toolName;
	}
}
