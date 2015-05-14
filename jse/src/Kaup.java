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
			System.out.print("키를 입력해주세요 :");
			height = scanner.nextFloat();
			System.out.print("몸무게를 입력해주세요 :");
			weight = scanner.nextFloat();
			
			KaupVO vo = new KaupVO();
			vo.setHeight(height);
			vo.setWeight(weight);
			voKaupList.add(vo.getKaup());
			voList.add(vo);
			
			
			System.out.println("입력을 멈추시려면 n 을 눌러주세요 : ");
			cmd = scanner.next();
			
		}while(!cmd.equalsIgnoreCase("n"));
	}
		
	
	public void listUserHeightAndWeight(){
		
		System.out.println("---------------------------------");
		System.out.println("\t\t리스트");
		System.out.println("---------------------------------");
		
		for(int i=0; i<voList.size(); i++){
			KaupVO vo = voList.get(i);
			
			System.out.println("[" + (i+1) + "]번째 유저의 키와 몸무게..");
			System.out.println("키 : " + vo.getHeight());
			System.out.println("몸무게 : " + vo.getWeight());
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		
		listKaup();
		
	}
	
	private void listKaup(){
		System.out.println("------------------------------");
		System.out.println("\t\tKAUP 지수입니다");
		System.out.println("------------------------------");
		
		for(int i=0; i<voList.size(); i++){
			System.out.println((i+1) + "번 째 유저의 Kaup 지수..");
			System.out.println(voKaupList.get(i));
			System.out.println();
		}
		
		
	}
	
	public static void main(String[] args) {
		Kaup kaup = new Kaup();
		kaup.doService();
		kaup.listUserHeightAndWeight();
		
		System.out.println("프로그램을 종료합니당..");
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
		return "[키=" + getHeight() + "cm, 몸무게=" + getWeight() + "kg, 카우프지수=" + idx + ", scanner=" + getMsg() + "]";
	}
	
	private void setIdxAndMsg(){
		
		idx = (int)((weight / (height * height)) * 10000);
		
		if(idx > 30)
			msg = "비만";
		else if (idx > 24)
			msg = "과체중";
		else if (idx > 20)
			msg = "정상";
		else if (idx > 15)
			msg = "저체중";
		else if (idx > 13)
			msg = "마름";
		else if (idx > 10)
			msg = "영양실조";
		else
			msg = "소모증";
		
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


