package ch09.resolve14.resolve03;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 3. 삼진아웃게임을 만듭니다
 *    두 사람중에 한 사람이 0~9까지 3개의 숫자중 중복없이 임의의 숫자를 선택합니다
 *     예를 들어 3 1 9를 선택했다면
 *    다른 한사람이 3개의 숫자를 맞추고 결과를 응답받습니다
 *    같은 숫자 동일한 자리일 경우 1스트라이크
 *    같은 숫자 다른 자리일 경우 1볼입니다
 *    세자리 숫자 모두 자리까지 일치할 경우는 삼진아웃!!으로 처리합니다

 *    클래스를 구현하세요
 *    GeneratorThreeNum // 난수 3개를 생성하는 역할
 *    BaseBallMenu      // 메뉴를 담당하는 역할
 *    DecisionBall      // 스트라이크, 볼을 판단하는 역할
 *    BaseBallMain	  // main메서드를 실행하는 역할
 *    
 *    
 *    예를 들어 진행은 다음과 같습니다
 *    
 *    첫번째 숫자 입력 >> 3
 *    두번째 숫자 입력 >> 0
 *    세번째 숫자 입력 >> 8
 *    ==> 1스트라이크 0볼
 *    
 *    
 *    첫번째 숫자 입력 >> 1
 *    두번째 숫자 입력 >> 0
 *    세번째 숫자 입력 >> 9
 *    ==> 1스트라이크 1볼
 *    
 *    
 *    첫번째 숫자 입력 >> 3
 *    두번째 숫자 입력 >> 0
 *    세번째 숫자 입력 >> 9
 *    ==> 2스트라이크 0볼
 *    
 *    
 *    첫번째 숫자 입력 >> 3
 *    두번째 숫자 입력 >> 1
 *    세번째 숫자 입력 >> 9
 *    ==> 3스트라이크 0볼
 *    ==> 삼진아웃!!
 *    
 *    다시하시겠습니까(Y/N)?
 */

public class BaseBallMain {

	public static void main(String[] args) {
		BaseBallMenu player = new BaseBallMenu();
		GeneratorThreeNum random = new GeneratorThreeNum();
		DecisionBall game = new DecisionBall();

		int[] randomNums = random.generate(); // 난수 생성 및 저장

		boolean playAgain = true;
		Scanner scanner = new Scanner(System.in);

		while (playAgain) {
			player.viewMenu();
			String strikeResult = game.strike(randomNums, player);
            String ballResult = game.ball(randomNums, player);
			System.out.println("난수: " + Arrays.toString(randomNums)); // 난수 출력
			System.out.println("==> " + strikeResult + ballResult);

			if (strikeResult.equals("3스트라이크 ")) {
				System.out.println("==> 삼진아웃!!");
				System.out.print("다시하시겠습니까(Y/N)? ");
				String playAgainInput = scanner.next();
				playAgain = playAgainInput.equals("Y");
			}
		}

		scanner.close();
	}

}
