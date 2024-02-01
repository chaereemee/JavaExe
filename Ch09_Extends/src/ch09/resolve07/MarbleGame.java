package ch09.resolve07;

public class MarbleGame {
	private int marbleNum;  // 구슬 개수 

	public MarbleGame(int marbleNum) {  // 생성자 
		this.marbleNum = marbleNum;
	}
	
	public void takeMarble(int marbleNum) {  // 받다 
		this.marbleNum += marbleNum;
	}
	
	public void giveMarble(int marbleNum) {  // 주다 
		this.marbleNum -= marbleNum;
	}
	
	public void result() {
		System.out.println("보유 자산 -> 구슬 " + marbleNum + "개");
	}
}
