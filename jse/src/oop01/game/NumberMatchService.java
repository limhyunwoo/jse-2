package oop01.game;

import java.security.InvalidParameterException;

public class NumberMatchService {
	
	public void doService(int userInput) throws Exception{

		if( !(userInput >= 1 && userInput <= 3))
			throw new InvalidParameterException();
		
		NumberMatchVO vo = new NumberMatchVO();
		vo.setUserInput(userInput);
		vo.setCpuInput();
		
		System.out.println("��ǻ�Ͱ� ������ ���ڴ� " + vo.getCpuInput() + "�Դϴ�.");

		if(vo.getUserInput() == vo.getCpuInput())
			System.out.println("�̰���ϴ�. �����մϴ�.");
		else
			System.out.println("���̱���. �׷��� �� ������ �մϱ�?");
		
	}
	
}
