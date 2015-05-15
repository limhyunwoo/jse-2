package oop01.encapsule;

import java.util.Scanner;

public class KaupService {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("키를 입력하세요");
		double height = scanner.nextDouble();
		System.out.println("몸무게를 입력하세요");
		double weight = scanner.nextDouble();
		
		
		/*
		 * 코드 완성 
		 * 	
		 */
		
		KaupVO kaup = new KaupVO(height, weight);
		System.out.println(kaup.toString());
		
		System.out.println("완료");
		
		scanner.close();
	}
}
