package oop01.game;

import java.util.Scanner;


public class NumberMatchController {

	public static void main(String[] args) {
		NumberMatchService service = new NumberMatchService();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1~3 ������ ���� �Է����ּ��� : ");
		int userInput = scanner.nextInt();
		
		try{
			service.doService(userInput);
		}catch(Exception e){
			throw new RuntimeException(e);
		}finally{
			scanner.close();
		}
		
		
	}
}
