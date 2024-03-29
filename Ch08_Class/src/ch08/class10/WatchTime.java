package ch08.class10;

/*
 * 메서드의 오버로딩 
 * Java는 함수의 이름은 동일하지만 매개변수가 다른 함수를 여러 개 만들 수 있다.
 * 실행할 때 매개변수의 종류에 따라 함수를 구별할 수 있기 때문에 
 */
class WatchTime {
	private int hour, min, sec;
	private String strHour, strMin, strSec;
	private boolean isNim = true;
	
	// 생성자
	public WatchTime(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
		this.isNim = true;
	}
	public WatchTime(String strHour, String strMin, String strSec) {
		this.strHour = strHour;
		this.strMin = strMin;
		this.strSec = strSec;
		this.isNim = false;
	}
	
	public void viewTime() {
		if(isNim) 
			System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);
		else
			System.out.printf("[%s:%s:%s]\n", strHour, strMin, strSec);
	}
	
	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 13, 13);
		wtNum.viewTime();
		
		WatchTime wtStr = new WatchTime("열두시", "이십분", "오십초");
		wtStr.viewTime();
	}
}
