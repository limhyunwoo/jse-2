package oop01.encapsule;

public class PayService {

	
	
	private PayVO vo = new PayVO();  
	
	public void doService(String name, int salary) {
		
		vo.setName(name);
		vo.setSalary(salary);
	}
	
	public int extractIncome(){
		return (int)(vo.getSalary() - (vo.getSalary() * PayVO.TAX));
	}
	
	public int extractTaxPercent(){
		return (int)(PayVO.TAX * 100);
	}
}

