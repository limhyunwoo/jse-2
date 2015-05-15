package oop01.encapsule;

import java.util.Scanner;

public class PayController {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		PayService service = new PayService();
		
		String name;
		int salary;
		
		System.out.print("이름 : ");
		name = scanner.nextLine();
		
		System.out.print("월급 : ");
		salary = scanner.nextInt();
		
		service.doService(name, salary);
		
		System.out.println("===== 급여내역 =========");
		System.out.println("성명 : " + name);
		System.out.println("본봉 : " + salary);
		System.out.println("세금 : " + service.extractTaxPercent());
		System.out.println("실수령액 : " + service.extractIncome());
		
		
		scanner.close();
	}
}
