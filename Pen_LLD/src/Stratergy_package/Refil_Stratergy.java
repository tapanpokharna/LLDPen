package Stratergy_package;

public abstract class Refil_Stratergy {
	int count =0;
	public abstract void refil();
	public abstract int remaining_count();
	
	public void reduceCount(int c) {
		this.count -=c;
	}
}
