package ch09.extends03;

public class Father extends GrandFather {
	
	long money = 10000000000000000L;
	
	Father() {
		System.out.println("Father 생성자");
	}
	
	void wealth() {    // wealth : 재산 
		System.out.println("돈을 많이 벌었다ㅎ");
	}
}
