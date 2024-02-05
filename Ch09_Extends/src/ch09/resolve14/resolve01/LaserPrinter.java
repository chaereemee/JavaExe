package ch09.resolve14.resolve01;

// 레이저 프린트 
public class LaserPrinter extends Printer {
	protected int tonerRemaining;    // 토너 잔량 
	
	public LaserPrinter(String modelName, String company, String interfaceType,
			int numOfPrints, int paperRemaining, int tonerRemaining) {
		super(modelName, company, interfaceType, numOfPrints, paperRemaining);
		this.tonerRemaining = tonerRemaining;
	}
	
	@Override
	public void showPrinterInfo() {
		super.showPrinterInfo();
		System.out.println("tonerRemaining : " + tonerRemaining);
	}
	
	@Override
	public double print() {
		double paper = (double)paperRemaining - 1;
		if(paper < 0) 
			System.out.println("인쇄용지가 부족합니다.");
		else
			System.out.println("인쇄 성공!");
		return paper;
	}
}
