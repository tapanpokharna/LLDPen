package Stratergy_package;

public class Pen_Write extends Write_Stratergy{

	@Override
	public void writeFromString(String input) {
		System.out.print(" Writing from Pen_Write with font : " + this.font);
		if(this.bold) {
			System.out.println(" and in BOLD");
		} else {
			System.out.println(" and not in bold");
		}
		System.out.println(input);
	}

}
