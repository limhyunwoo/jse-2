package cmm04.array;

public class No02_StringArrayVO {
	
	String[] juso = new String[3];
	
	public No02_StringArrayVO(){
		juso[0] = "����";
		juso[1] = "����";
		juso[2] = "��ȭ��";
	}
	
	public void execute(){
		
		for(int i = 0; i<juso.length; i++){
			System.out.print(juso[i] + " ");
		}
	}
}
