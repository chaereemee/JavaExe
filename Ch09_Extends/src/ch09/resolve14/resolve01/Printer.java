package ch09.resolve14.resolve01;

public abstract class Printer {
	protected String modelName;      // 모델명
	protected String company;        // 제조사
	protected String interfaceType;  // 인터페이스 종류 (USB, paraller port)
	protected int numOfPrints;       // 인쇄매수 
	protected int paperRemaining;   // 인쇄 종이 잔량 
	
	public Printer(String modelName, String company, String interfaceType,
			int numOfPrints, int paperRemaining) {
		this.modelName = modelName;
		this.company = company;
		this.interfaceType = interfaceType;
		this.numOfPrints = numOfPrints;
		this.paperRemaining = paperRemaining;
	}
	
	public void showPrinterInfo() {
		System.out.println("--------------------");
		System.out.println("modelName : " + modelName);
		System.out.println("company : " + company);
		System.out.println("interfaceType : " + interfaceType);
		System.out.println("numOfPrints : " + numOfPrints);
		System.out.println("paperRemaining : " + paperRemaining);
	}
	
	public abstract double print();
}
