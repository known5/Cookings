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
	private int ingredientID;
	private String ingredientName;
	private String amountType;
	
	/**
	 * Class constructor.
	 * 
	 * @param IDArg	ingredient ID
	 * @param nameArg ingredient Name
	 * @param typeArg ingredient Type
	 */
	public Ingredient(int IDArg, String nameArg, String typeArg) {
		super();
		setIngredientID(IDArg);
		setIngredientName(nameArg);
		setAmountType(typeArg);
	}

	public int getIngredientID() {
		return ingredientID;
	}

	public void setIngredientID(int ingredientID) {
		this.ingredientID = ingredientID;
	}

	public String getIngredientName() {
		return ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	public String getAmountType() {
		return amountType;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}
	
}
