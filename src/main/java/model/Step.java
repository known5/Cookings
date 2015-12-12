package model;

/**
 * 
 * @author Luc
 *
 *
 */

public class Step {
	/**
	 * Class variables
	 */
	private int stepID;
	private double stepTime;
	private String stepContent;
	/**
	 * Class contructor, creates a Step instance with an ID a time and content of what to do in that step.
	 * 
	 * @param stepIDArg	Id of the step
	 * @param stepTimeArg	estimateted time to complete the step
	 * @param stepContentArg	what to do in the step.
	 */
	public Step(int stepIDArg, double stepTimeArg, String stepContentArg) {
		stepID = stepIDArg;
		stepTime = stepTimeArg;
		stepContent = stepContentArg;
	}
	
	public void setTime(double para) {
		if (para < 0.0) {
			stepTime = para;
		} else {
			print("You cannot set the time to a negative");
		}
	}
	
	public void setContent(String para) {
		if (para != null) {
			stepContent = para;
		} else {
			print("You cannot set content to NULL");
		}
	}
	
	public void removeContent() {
		stepContent = "";
	}
	
	public int getStepID() {
		return stepID;
	}

	public void setStepID(int stepID) {
		this.stepID = stepID;
	}

	public void print(String printArg) {
		if (printArg != null) {
			System.out.println(printArg);
		} else {
			System.out.println("You did not add a Stringvalue as parameter to the print function");
		}
	}
	
}
