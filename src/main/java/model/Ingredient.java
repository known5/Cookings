package model;

/**
 * 
 * @author Luc
 *
 */

public class Ingredient {
	/**
	 * Class variables
	 */
	public int ingredientID;
	public String ingredientName;
	public String amountType;
	
	/**
	 * Class constructor.
	 * 
	 * @param IDArg	ingredient ID
	 * @param nameArg ingredient Name
	 * @param typeArg ingredient Type
	 */
	public Ingredient(int IDArg, String nameArg, String typeArg) {
		super();
		ingredientID = IDArg;
		ingredientName = nameArg;
		amountType = typeArg;
	}
	
	
}
