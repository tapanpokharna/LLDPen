package Pen_package;
import Stratergy_package.Refil_Stratergy;

public class Refill_Pen extends Pen{

	public Refill_Pen(Refil_Stratergy strat) {
		System.out.println("Refil Pen");
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
		System.out.println("Refil Pen of colour : " + colour_Of_Pen + " can write " + rem + " letters");
	}

	//@Override
	public boolean isWorking() {
		if(strat.remaining_count() > 0) return true;
		return false;
	}
}
