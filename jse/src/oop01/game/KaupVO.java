package oop01.game;


public class KaupVO {
	private double height;
	private double weight;
	private int idx;
	
	public KaupVO() {
		this(0,0);
	}
	
	
	public KaupVO(double i, double j) {
		this.height = i;
		this.weight = j;
		this.idx = (int)((weight / (height * height)) * 10000);
	}
	
	
	public String getMsg(){
		String msg = "";
		
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
		
		
		return msg;
	}
	

	@Override
	public String toString(){
		return "[Ű=" + getHeight() + "cm, ������=" + getWeight() + "kg, ī��������=" + getIdx() + ", scanner=" + getMsg() + "]";
	}

	

	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public int getIdx() {
		return idx;
	}


	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	
	
}
