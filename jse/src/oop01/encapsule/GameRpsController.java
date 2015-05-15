package oop01.encapsule;

import java.util.Scanner;

public class GameRpsController {

	public static void main(String[] args) {
		
		GameRpsService service = new GameRpsService();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���������� ������ �����մϴ�.");
		System.out.println("����:1 ����:2 ��:3 �� �Է��ϼ���.");
		int playerValue = scanner.nextInt();
		System.out.println("����� " + service.showRpsValue(playerValue) + "�� �½��ϴ�.");
		int comValue = service.displayComValue();
		System.out.println("��ǻ�ʹ� " + service.showRpsValue(comValue) + "�� �½��ϴ�.");
		
		String winner = service.showWinner();
		
		System.out.println("�¸��ڴ� " + winner + "�Դϴ�.");
		
		scanner.close();
	}
}

