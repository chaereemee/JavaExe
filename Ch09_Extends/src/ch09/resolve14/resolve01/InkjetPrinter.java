package ch09.resolve14.resolve01;

// 잉크젯 프린터 
public class InkjetPrinter extends Printer {
	protected int inkRemaining;     // 잉크 잔량 
	
	public InkjetPrinter(String modelName, String company, String interfaceType,
			int numOfPrints, int paperRemaining, int inkRemaining) {
		super(modelName, company, interfaceType, numOfPrints, paperRemaining);
		this.inkRemaining = inkRemaining;
	}
	
	@Override
	public void showPrinterInfo() {
		super.showPrinterInfo();
		System.out.println("inkRemaining : " + inkRemaining);
	}
	
	@Override
	public double print() {
		double paper = (double)paperRemaining - numOfPrints;
		if(paper < 0) 
			System.out.println("인쇄용지가 부족합니다.\n인쇄 실패!");
		else
			System.out.println("인쇄 성공!");
		return paper;
	}
	
}
