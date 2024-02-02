package ch09.iskindof06;

public class Police extends Gun {
	
	private int handCuffs;
	
	public Police(int bullet, int handCuffs) {  // (총알, 수갑)
		super(bullet);
		this.handCuffs = handCuffs;
	}
	
	public void putHandCuff() {
		if(handCuffs > 0) {
			System.out.println("SNAP!");   // 짤깍!
			handCuffs--;
		} else {
			System.out.println("Miss...");
		}
	}
}
