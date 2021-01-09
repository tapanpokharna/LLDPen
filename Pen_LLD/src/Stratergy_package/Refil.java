package Stratergy_package;

public class Refil extends Refil_Stratergy{
	
	@Override
	public void refil(){
		this.count = 1000;
		System.out.println("Refil changed");
	}

	@Override
	public int remaining_count() {
		// TODO Auto-generated method stub
		return count;
	}

}
