package model;

import java.util.Set;

/**
 * 
 * @author Luc
 *
 */

public class Recipe {
	
	public int recipeID;
	public Step[] stepSequence;
	public String recipeName;
	public Set<Tool> toolSet;
	public Set<Ingredient> requiredIngredients;
	public Set<Component> requiredComponents;
	
	
	public Recipe(int recipeIDArg, String recipeNameArg) {
		recipeID = recipeIDArg;
		recipeName = recipeNameArg;
	}
	
	public void addIngredient(Ingredient argument) {
		if (requiredIngredients.contains(argument) && argument != null) {
			print("Ingredient already added to the recipe");
		} else {
			requiredIngredients.add(argument);
		}
	}
	
	public void removeIngredient(int argument) {
		for (Ingredient entry : requiredIngredients) {
			if (entry.ingredientID == argument) {
				requiredIngredients.remove(entry);
				break;
			}
		}
	}
	
	public void addTool(Tool argument) {
		if (toolSet.contains(argument) && argument != null) {
			print("Tool was already added to the recipe");
		} else {
			toolSet.add(argument);
		}
	}
	
	public void removeTool(int argument) {
		for (Tool entry : toolSet) {
			if (entry.toolID == argument) {
				toolSet.remove(entry);
				break;
			}
		}
	}
	
	public void addStep(Step argument) {
		if (argument != null) {
			stepSequence[stepSequence.length] = argument;
		} else {
			print("You can only add steps.");
		}
	}
	
	public void removeStep(int IDArg) {
		for (int i = 0; i < stepSequence.length; i++) {
			if (stepSequence[i].stepID == IDArg) {
				stepSequence[i] = null;
				print("Step: " + Integer.toString(IDArg) + " removed");
				break;
			}
		}
	}
	
	public void addComponent(Component argument) {
		if (requiredComponents.contains(argument) && argument != null) {
			print("Tool was already added to the recipe");
		} else {
			requiredComponents.add(argument);
		}
	}
	
	public void removeComponent(int argument) {
		for (Component entry : requiredComponents) {
			if (argument == entry.componentID) {
				requiredComponents.remove(entry);
				break;
			}
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
