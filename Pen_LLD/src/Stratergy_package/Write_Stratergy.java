package Stratergy_package;

public abstract class Write_Stratergy {

	String font = "Times New Roman";
	boolean bold = false;
	
	public abstract void writeFromString(String input);
	
	public void setFont(String font) {
		this.font = font;
	}

	public void setBold() {
		this.bold = true;
	}
	
}
