package ch15.thread01.ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); // Toolket 객체 얻기
		for (int i = 0; i < 5; i++) {
			toolkit.beep(); // 비프음 발생
			try {
				Thread.sleep(500); // 0.5초간 일시 정지
			} catch (Exception e) {
			}
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500); // 0.5초간 일시 정지
			} catch (Exception e) {
			}
		}
	}
}

/*
 * 0.5 주기로 비프음을 발생시키면서 동시에 프린팅까지 하는 작업이지만, 메인 스레드는 비프음 발생 후 프린트를 시작한다.
 */