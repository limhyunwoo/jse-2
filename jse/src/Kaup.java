import java.util.ArrayList;
import java.util.Scanner;


public class Kaup {
	
	private ArrayList<KaupVO> voList = new ArrayList<KaupVO>();
	private Scanner scanner = new Scanner(System.in);
	private ArrayList<String> voKaupList = new ArrayList<String>();
	
	
	public void doService(){
		String cmd = "y";
		
		float weight = 0.0f, height = 0.0f;
		
		do{
			System.out.print("Ű�� �Է����ּ��� :");
			height = scanner.nextFloat();
			System.out.print("�����Ը� �Է����ּ��� :");
			weight = scanner.nextFloat();
			
			KaupVO vo = new KaupVO();
			vo.setHeight(height);
			vo.setWeight(weight);
			voKaupList.add(vo.getKaup());
			voList.add(vo);
			
			
			System.out.println("�Է��� ���߽÷��� n �� �����ּ��� : ");
			cmd = scanner.next();
			
		}while(!cmd.equalsIgnoreCase("n"));
	}
		
	
	public void listUserHeightAndWeight(){
		
		System.out.println("---------------------------------");
		System.out.println("\t\t����Ʈ");
		System.out.println("---------------------------------");
		
		for(int i=0; i<voList.size(); i++){
			KaupVO vo = voList.get(i);
			
			System.out.println("[" + (i+1) + "]��° ������ Ű�� ������..");
			System.out.println("Ű : " + vo.getHeight());
			System.out.println("������ : " + vo.getWeight());
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		listKaup();
		
	}
	
	private void listKaup(){
		System.out.println("------------------------------");
		System.out.println("\t\tKAUP �����Դϴ�");
		System.out.println("------------------------------");
		
		for(int i=0; i<voList.size(); i++){
			System.out.println((i+1) + "�� ° ������ Kaup ����..");
			System.out.println(voKaupList.get(i));
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		Kaup kaup = new Kaup();
		kaup.doService();
		kaup.listUserHeightAndWeight();
		
		System.out.println("���α׷��� �����մϴ�..");
	}
}

class KaupVO{
	private float height;
	private float weight;
	private int idx;
	private String msg;
	
	
	
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getKaup(){
		setIdxAndMsg();
		return "[Ű=" + getHeight() + "cm, ������=" + getWeight() + "kg, ī��������=" + idx + ", scanner=" + getMsg() + "]";
	}
	
	private void setIdxAndMsg(){
		
		idx = (int)((weight / (height * height)) * 10000);
		
		if(idx > 30)
			msg = "��";
		else if (idx > 24)
			msg = "��ü��";
		else if (idx > 20)
			msg = "����";
		else if (idx > 15)
			msg = "��ü��";
		else if (idx > 13)
			msg = "����";
		else if (idx > 10)
			msg = "�������";
		else
			msg = "�Ҹ���";
		
	}
	
	
	
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}

	
}


