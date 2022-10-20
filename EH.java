package oct5;

public class EH extends Thread {
	
	
	static void td() {
		
		
		for (int i = 1; i <101; i++) {
			System.out.println(i);
			
		}

	}
	public static void main(String []args) {
		int num =0;
		int d;
		
		EH h=new EH();
		h.td();
        currentThread();
	
		for (int i = 101; i < 201; i++) {
			System.out.println(i);	
		}
		
		}
	}
