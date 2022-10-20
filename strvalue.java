package sam;

import java.util.Scanner;

public class strvalue {
	static Scanner sa;
	
	public static void main(String[] args) {
		String st ="key:1:count:13_key:2:count:12_key:3:count:3";
		System.out.println(st);
		System.out.println("Select the key to increace value  :");
		String[] ss = st.split("_");
		
		String hh="";
		sa= new Scanner(System.in);
		int val = sa.nextInt();
         for (int i = 0; i < ss.length; i++) {
			String data=ss[i];
			
			String[] a = data.split(":");
			int st1=Integer.parseInt(a[1]);
			//System.out.println(st1);
			int st2=Integer.parseInt(a[3]);
			//System.out.println(st2);
	
			if (st1==val) {
				st2=st2+1;	
			}
			//System.out.println(count);
			hh=a[0]+":"+a[1]+":"+a[2]+":"+st2;
			System.err.println(hh);
		}
         
	}

}
