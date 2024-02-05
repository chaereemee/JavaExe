package ch09.resolve14.resolve01;

import java.util.Scanner;

public class PrinterManager {
	private final int PRINTER_USE = 100;
	private Printer[] printerArr = new Printer[PRINTER_USE];
	private int numOfPrinter = 0;
	Scanner sc = new Scanner(System.in);
	
	private int viewMenu() {
		System.out.println("[ 프린트 선택 ]");
		System.out.println("1. 잉크젯 프린트");
		System.out.println("2. 레이저 프린트");
		System.out.println("3. 전체 정보 보기");
		System.out.println("4. 잉크젯 정보 보기");
		System.out.println("5. 레이저 정보 보기");
		System.out.println("6. 종료");
		System.out.print("번호 입력 >> ");
		int sel = sc.nextInt();
		return sel;
	}
	
	private InkjetPrinter createInkjetPrinter() {
		System.out.print("모델명 >> ");
		String modelName = sc.next();
		System.out.print("제조사 >> ");
		String company = sc.next();
		System.out.print("인터페이스 종류(USB, paraller port) >> ");
		String interfaceType = sc.next();
		System.out.print("인쇄 매수 >> ");
		int numOfPrints = sc.nextInt();
		System.out.print("인쇄 종이 잔량 >> ");
		int paperRemaining = sc.nextInt();
		System.out.print("잉크 잔량 >> ");
		int inkRemaining = sc.nextInt();
		
		InkjetPrinter printer = new InkjetPrinter(modelName,company, interfaceType,
				numOfPrints, paperRemaining, inkRemaining);
		return printer;
	}
	
	private LaserPrinter createLaserPrinter() {
		System.out.print("모델명 >> ");
		String modelName = sc.next();
		System.out.print("제조사 >> ");
		String company = sc.next();
		System.out.print("인터페이스 종류(USB, paraller port) >> ");
		String interfaceType = sc.next();
		System.out.print("인쇄 매수 >> ");
		int numOfPrints = sc.nextInt();
		System.out.print("인쇄 종이 잔량 >> ");
		int paperRemaining = sc.nextInt();
		System.out.print("토너 잔량 >> ");
		int tonerRemaining = sc.nextInt();
		
		LaserPrinter printer = new LaserPrinter(modelName,company, interfaceType,
				numOfPrints, paperRemaining, tonerRemaining);
		return printer;
	}
	
	private boolean savePrinter(Printer printer) {
		boolean isSave = true;
		
		if(this.numOfPrinter < PRINTER_USE) {
			this.printerArr[this.numOfPrinter] = printer;
			this.numOfPrinter++;
			isSave = true;
		} else {
			isSave = false;
		}
		
		return isSave;
	}
	
	private void viewAllPrinterInfo() {
		for(int i=0;i<this.numOfPrinter;i++) {
			this.printerArr[i].showPrinterInfo();
			this.printerArr[i].print();
		}
	}
	
	private void viewInkjetPrinterInfo() {
		for(int i=0;i<this.numOfPrinter;i++) {
			Printer printer = this.printerArr[i];
			if(printer instanceof InkjetPrinter) {
				this.printerArr[i].showPrinterInfo();
				this.printerArr[i].print();
			}
		}
	}
	
	private void viewLaserPrinterInfo() {
		for(int i=0;i<this.numOfPrinter;i++) {
			Printer printer = this.printerArr[i];
			if(printer instanceof LaserPrinter) {
				this.printerArr[i].showPrinterInfo();
				this.printerArr[i].print();
			}
		}
	}
	
	public void run() {
		boolean isRun = true;
		while(isRun) {
			int selNum = viewMenu();
			Printer printer = null;
			
			switch(selNum) {
			case PrinterMenu.INKJET_PRINTER:
				printer = createInkjetPrinter();
				break;
			case PrinterMenu.LASER_PRINTER:
				printer = createLaserPrinter();
				break;
			case PrinterMenu.ALL_INFO:
				printer = null;
				viewAllPrinterInfo();
				break;
			case PrinterMenu.INKJET_INFO:
				printer = null;
				viewInkjetPrinterInfo();
				break;
			case PrinterMenu.LASER_INFO:
				printer = null;
				viewLaserPrinterInfo();
				break;
			case PrinterMenu.EXIT:
				printer = null;
				isRun = false;
				break;
			default:
				printer = null;
				System.out.println("해당 항목이 존재하지 않습니다.");
				break;
			}
			
		boolean isSave = savePrinter(printer);
		if(!isSave)
			System.out.println("더 이상 프린터를 사용할 수 없습니다.");
		}
		System.out.println("Program Exit...");
	}
}
