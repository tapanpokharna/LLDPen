package Pen_package;
import Stratergy_package.Pen_Write;
import Stratergy_package.Refil_Stratergy;
import Stratergy_package.Write_Stratergy;

abstract public class Pen {
	String colour_Of_Pen = "Black";
	Refil_Stratergy strat;
	Write_Stratergy wStrat= new Pen_Write();
	
	public void setColour_Of_Pen(String colour_Of_Pen) {
		this.colour_Of_Pen = colour_Of_Pen;
		//System.out.println("Successfully created a new pen of colour : " + colour_Of_Pen);
	}
	
	public abstract void refil_pen();

	//public abstract void setStrat(Refil_Stratergy strat);
	public abstract void penDetails();
	public abstract boolean isWorking();
	public void setWriteStratergy(Write_Stratergy wStrat) {
		this.wStrat=wStrat;
	}
	public void write(String str) {
		wStrat.writeFromString(str);
		strat.reduceCount(str.length());
	}
	
	public void makeBold() {
		wStrat.setBold();
	}
	
	public void font(String str) {
		wStrat.setFont(str);
	}
	
}
