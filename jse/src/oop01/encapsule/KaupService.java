package oop01.encapsule;

import java.util.Scanner;

public class KaupService {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ű�� �Է��ϼ���");
		double height = scanner.nextDouble();
		System.out.println("�����Ը� �Է��ϼ���");
		double weight = scanner.nextDouble();
		
		
		/*
		 * �ڵ� �ϼ� 
		 * 	
		 */
		
		KaupVO kaup = new KaupVO(height, weight);
		System.out.println(kaup.toString());
		
		System.out.println("�Ϸ�");
		
		scanner.close();
	}
}
