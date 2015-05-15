package oop01.encapsule;

import java.util.Scanner;

public class PayController {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		PayService service = new PayService();
		
		String name;
		int salary;
		
		System.out.print("�̸� : ");
		name = scanner.nextLine();
		
		System.out.print("���� : ");
		salary = scanner.nextInt();
		
		service.doService(name, salary);
		
		System.out.println("===== �޿����� =========");
		System.out.println("���� : " + name);
		System.out.println("���� : " + salary);
		System.out.println("���� : " + service.extractTaxPercent());
		System.out.println("�Ǽ��ɾ� : " + service.extractIncome());
		
		
		scanner.close();
	}
}
