package oop01.game;

import java.security.InvalidParameterException;

public class NumberMatchService {
	
	public void doService(int userInput) throws Exception{

		if( !(userInput >= 1 && userInput <= 3))
			throw new InvalidParameterException();
		
		NumberMatchVO vo = new NumberMatchVO();
		vo.setUserInput(userInput);
		vo.setCpuInput();
		
		System.out.println("컴퓨터가 선택한 숫자는 " + vo.getCpuInput() + "입니다.");

		if(vo.getUserInput() == vo.getCpuInput())
			System.out.println("이겼습니다. 축하합니다.");
		else
			System.out.println("지셨군요. 그러게 왜 도박을 합니까?");
		
	}
	
}
