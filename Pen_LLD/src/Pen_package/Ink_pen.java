package Pen_package;
import Stratergy_package.Refil_Stratergy;

public class Ink_pen extends Pen {
	
	public Ink_pen(Refil_Stratergy strat) {
		System.out.println("Ink Pen");
		this.strat = strat;
	}
	
	@Override
	public void refil_pen() {
		strat.refil();
	}
	
	@Override
	public void penDetails() {
		int rem = strat.remaining_count();
		if(this.isWorking()) {
			System.out.print("Working ");
		} else {
			System.out.print("Not Working ");
		}
		System.out.println("Ink Pen of colour : " + colour_Of_Pen + " can write " + rem + " letters");
	}

	public boolean isWorking() {
		if(strat.remaining_count() > 0) return true;
		return false;
	}
}
