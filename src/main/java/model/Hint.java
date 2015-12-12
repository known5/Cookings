package model;

/**
 * 
 * @author Luc
 *
 */

public class Hint {

	private int hintID;
	private String hintContent;
	
	public Hint(int idArg) {
		setHintID(idArg);
	}
	
	public Hint(int idArg, String contentArg) {
		setHintID(idArg);
		setHintContent(contentArg);
	}
	
	public void replaceContent(String para) {
		if (para != null) {
			setHintContent(para);
		} else {
			print("cannot replace content with null");
		}
	}
	
	public void removeContent() {
		setHintContent("");
	}
	
	public void print(String printArg) {
		if (printArg != null) {
			System.out.println(printArg);
		} else {
			System.out.println("You did not add a Stringvalue as parameter to the print method");
		}
	}

	public int getHintID() {
		return hintID;
	}

	public void setHintID(int hintID) {
		this.hintID = hintID;
	}

	public String getHintContent() {
		return hintContent;
	}

	private void setHintContent(String hintContent) {
		this.hintContent = hintContent;
	}
	
}
