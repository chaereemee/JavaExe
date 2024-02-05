package ch09.resolve14.resolve03;

// 스트라이크, 볼을 판단하는 역할 

public class DecisionBall {
	
	public String strike(int randomNums[] ,BaseBallMenu player) {
		int playerNums[] = player.getPlayerNums();
		int strikeCnt = 0;
		
		for(int i=0; i<3; i++) {
			if(randomNums[i] == playerNums[i]) {
				strikeCnt++;
			}
		}
		
		return strikeCnt + "스트라이크 ";
	}
	
	public String ball(int randomNums[] ,BaseBallMenu player) {
		int playerNums[] = player.getPlayerNums();
		int ballCnt = 0;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				if(randomNums[i] == playerNums[j]) {
					if(i != j) {
						ballCnt++;
					}
				}
			}
		}
		return ballCnt + "볼";
	}

}
