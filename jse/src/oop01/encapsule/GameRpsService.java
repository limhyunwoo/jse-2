package oop01.encapsule;


/*
  Date : 2015.05.15 
  Author : �����
  Description : ����, ����, �� ���ӳ���
  1 : ����
  2 : ����
  3 : ��
 *  
 */

public class GameRpsService {

	/*
	 ���ڰ��� ���� ����, ����, �� ���� ����
	 */
	public String showRpsValue(int playerValue) {
		
		String result = null;
		
		switch(playerValue){
			case 1:
				result = "����";
				break;
			case 2:
				result = "����";
				break; 
			case 3:
				result = "��";
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
	 ��ǻ�Ͱ� �������� �߻���Ų �� 1~3����
	 */
	public int displayComValue() {
		return (int)(Math.random() * 3) + 1;
	}

	/*
	 ���ڸ� �����ִ� ����
	 */
	public String showWinner(int playerValue, int comValue) {
		
		
	}

}
