package oop01.encapsule;


/*
  Date : 2015.05.15 
  Author : 김기태
  Description : 가위, 바위, 보 게임놀이
  1 : 가위
  2 : 바위
  3 : 보
 *  
 */

public class GameRpsService {

	/*
	 숫자값에 따른 가위, 바위, 보 결정 로직
	 */
	public String showRpsValue(int playerValue) {
		
		String result = null;
		
		switch(playerValue){
			case 1:
				result = "가위";
				break;
			case 2:
				result = "바위";
				break; 
			case 3:
				result = "보";
				break;
		}
		
		return result;
	}

	public String getCpuRPS() {
		return null;
	}

	public boolean wasUserWon() {
		return false;
	}

	/*
	 컴퓨터가 랜덤으로 발생시킨 수 1~3까지
	 */
	public int displayComValue() {
		return (int)(Math.random() * 3) + 1;
	}

	/*
	 승자를 보여주는 로직
	 */
	public String showWinner(int playerValue, int comValue) {
		
		
	}

}
