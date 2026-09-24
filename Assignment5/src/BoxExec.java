import java.util.Scanner;

class Box {
	private Object obj;

	public Object getObj() {
		return this.obj;
	}

	void setObj(Object obj) {
		this.obj = obj;
	}
}

public class BoxExec {
	public static void main(String[] args) {
 
		Box b1 = new Box();
		b1.setObj(10);
		Integer res1 = (Integer) b1.getObj();
		System.out.println("res : " + res1);
		
		Box b2 = new Box();
		b2.setObj("Hello");
		String res2 =  (String)b2.getObj();
		System.out.println("res : " + res2);
		
		Box b3 = new Box();
		b3.setObj(12.33);
		double res3 =  (double)b3.getObj();
		System.out.println("res : " + res3);
	}
}
