package model;

import java.util.Set;

/**
 * 
 * @author Luc
 *
 */

public class Component {
	/**
	 * Class variables.
	 */
	public int componentID;
	public String componentName;
	public String type;
	public Set<Ingredient> requirementsList;
	
	/**
	 * Class constructor, creates a component Instance which you can add required ingredients to.
	 * 
	 * @param IDArg	Component ID.
	 * @param nameArg Component name.
	 * @param typeArg Component Type.
	 */
	public Component(int IDArg, String nameArg, String typeArg) {
		componentID = IDArg;
		componentName = nameArg;
		type = typeArg;
	}

	/**
	 * Adds a required ingredient to the requirementsList.
	 * 
	 * @param requirementsArg the required ingredient.
	 */
	public void addRequirement(Ingredient requirementsArg) {
		if (requirementsList.contains(requirementsArg)) {
			print("Ingredient already in the requirements list");
		} else {
			requirementsList.add(requirementsArg);
		}
	}
	
	/**
	 * Removes a required ingredient from the requirementsList.
	 * 
	 * @param requirementsArg the removeable ingredient.
	 */
	public void removeRequirement(Ingredient requirementsArg) {
		if (requirementsList.contains(requirementsArg)) {
			requirementsList.remove(requirementsArg);
		} else {
			print("This argument was either already removed or never in the requirements Set");
		}
	}

	public void print(String printArg) {
		if (printArg != null) {
			System.out.println(printArg);
		} else {
			System.out.println("You did not add a Stringvalue as parameter to the print function");
		}
	}

}
