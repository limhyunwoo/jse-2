package oop01.encapsule;

import java.util.Scanner;

public class GameRpsController {

	public static void main(String[] args) {
		
		GameRpsService service = new GameRpsService();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.println("가위:1 바위:2 보:3 을 입력하세요.");
		int playerValue = scanner.nextInt();
		System.out.println("당신은 " + service.showRpsValue(playerValue) + "를 냈습니다.");
		int comValue = service.displayComValue();
		System.out.println("컴퓨터는 " + service.showRpsValue(comValue) + "을 냈습니다.");
		
		String winner = service.showWinner();
		
		System.out.println("승리자는 " + winner + "입니다.");
		
		scanner.close();
	}
}

