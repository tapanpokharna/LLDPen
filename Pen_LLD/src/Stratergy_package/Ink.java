package Stratergy_package;

public class Ink extends Refil_Stratergy{

	@Override
	public void refil(){
		this.count = 10;
		System.out.println("Ink added");
	}

	@Override
	public int remaining_count() {
		return count;
		// TODO Auto-generated method stub
		
	}
}
