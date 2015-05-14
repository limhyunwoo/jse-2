package oop01.game;

import java.util.InputMismatchException;

public class NumberMatchVO {
	private int userInput;
	private int cpuInput;
	
	
	public int getUserInput() {
		return userInput;
	}
	public void setUserInput(int userInput){
		this.userInput = userInput;
		
	}
	public int getCpuInput() {
		return cpuInput;
	}
	public void setCpuInput() {
		this.cpuInput = new java.util.Random().nextInt(3)+1;
	}
	
	
}
