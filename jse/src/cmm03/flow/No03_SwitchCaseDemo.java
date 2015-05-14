package cmm03.flow;

import java.util.Scanner;

public class No03_SwitchCaseDemo {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int getValue(boolean retry){
		
		String msg = "��� ������ �Է��ϼ���.";
		if(retry)
			msg += " �ٽ� �Է����ּ���.";
		
		System.out.println(msg);
		int inputAvg = scanner.nextInt();
		
		if( !(inputAvg >= 0 & inputAvg <= 100))
			return getValue(true);
		
		return inputAvg;
	}
	
	
	
	
	
	private static void printValue(int avg){
		String result;
		char grade = 'A';
		
		
		switch(avg/10){
		
		case 10:
		case 9:
			grade = 'A';
			break;
			
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
			
		case 6:
			grade = 'D';
			break;
			
		case 5:
			grade = 'E';
			break;
		default:
			break;
	}
		
		
		if(avg == 70){
			result = "�հ�";
		}else if(avg >= 70){
			result = "�հ�";
		}else{
			result = "�����";
		}
		
		System.out.println("���ϴ� " + result + "�̸�, ������ " + grade + "�Դϴ�");
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		while(true){
			int avg = getValue(false);
			
			if((avg/10 >= 0 && avg/10 <= 100)){
				// ����
				printValue(avg);
				break;
			}
		}
	
		
		
		// ��������� ���� �� �������ϱ�
		/*
		
		if(avg >= 90)
			grade = 'A';
		else if(avg >= 80)
			grade = 'B';
		else if(avg >= 70)
			grade = 'C';
		else if(avg >= 60)
			grade = 'D';
		else
			grade = 'F';
		*/
		// �� if else�� switch�� �ٲٽÿ�
		
	}
}
