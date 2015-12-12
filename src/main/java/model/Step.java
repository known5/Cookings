package model;

/**
 * 
 * @author Luc
 *
 * 
 *
 */

public class Step {
	/**
	 * Class variables
	 */
	public int stepID;
	public double stepTime;
	public String stepContent;
	
	/**
	 * Class contructor, creates a Step instance with an ID a time and content of what to do in that step.
	 * 
	 * @param stepIDArg	Id of the step
	 * @param stepTimeArg	estimateted tinme to complete the step
	 * @param stepContentArg	what to do in the step.
	 */
	public Step(int stepIDArg, double stepTimeArg, String stepContentArg) {
		stepID = stepIDArg;
		stepTime = stepTimeArg;
		stepContent = stepContentArg;
	}
	
	
}
