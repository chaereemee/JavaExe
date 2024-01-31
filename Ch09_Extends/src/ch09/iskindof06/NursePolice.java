package ch09.iskindof06;

public class NursePolice extends Police {
	
	private int thermometers;
	
	public NursePolice(int bullet, int handCuffs, int thermometers) {
		super(bullet, handCuffs);
		this.thermometers = thermometers;
	}
	
	public void calcTermometer() {
		if(thermometers > 0) {
			System.out.println("Check 36.5 Temp");
			thermometers--;
		} else {
			System.out.println("Check Temp");
		}
	}
}
