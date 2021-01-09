import Pen_package.Ink_pen;
import Pen_package.Pen;
import Pen_package.Refill_Pen;
import Stratergy_package.Ink;
import Stratergy_package.Refil;

public class Main {

	public static void main(String[] args) {
		Pen p1 = new Refill_Pen(new Refil());
		p1.setColour_Of_Pen("Blue");
		p1.refil_pen();
		
		Pen p2 = new Ink_pen(new Ink());
		//p2.setColour_Of_Pen("Black");
		p2.refil_pen();
		
		if(p1.isWorking()) {
			p1.write("not bold input!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ");
			p1.makeBold();
			p1.write("it works!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! ");
			p1.penDetails();
		} else {
			System.out.println("p1 needs to be refilleld");
		}
	}
}
