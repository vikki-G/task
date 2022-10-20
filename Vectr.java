package Tsks;

import java.util.Scanner;
import java.util.Vector;

public class Vectr {
	
	 static Vector<String> vv;
	 static Vector<Integer> pdscount;
	 
	 static void Sells(String a1, int gg) {
		 
		if (vv.contains(a1)) {
			int index = vv.indexOf(a1);
			 int count = pdscount.get(index) + gg;
			 pdscount.set(index, count);
			 System.out.println(".......Item selled......");
			 System.out.println("totally.............");
			 System.out.println(a1+" " + count);
		} else {
			System.out.println("invalid.....product!");
		} 
	 }
	static void buys(String ds,int al)
	{
		if(vv.contains(ds))
		{
			
			int index = vv.indexOf(ds);
			int count = pdscount.get(index) - al;
			pdscount.set(index, count);
			System.out.println(".......Item purchased .....");
			System.out.println("Remaining.........");
			System.out.println(ds + " " +count);
			}else {
				System.out.println("invalid.....product!");
			}
	}
	
	public static void main(String[] args) {
		System.out.println("buy? or sell?");
		Scanner sa = new Scanner(System.in);
		String a = sa.next();
		String bb ="buy";
		vv= new Vector<String>();
		 vv.add("adani");
		 vv.add("selmanufacture");
		 vv.add("icici");
		 vv.add("Tata");
		 vv.add("Goldmini");
		 vv.add("Bajaji");
		 vv.add("Airtel");
		 vv.add("Apple");
		 
		 pdscount = new Vector<>();
		 pdscount.add(10);
		 pdscount.add(18);
		 pdscount.add(20);
		 pdscount.add(12);
		 pdscount.add(23);
		 pdscount.add(18);
		 pdscount.add(14);
		 pdscount.add(25);
		if (a.equalsIgnoreCase(bb)) {
			 
//			 int s=vv.size();
			
			 for (String st : vv) {
				System.out.println(st);
			}
			 System.out.println("select the product :");
			 String ds = sa.next();
			 System.out.println("Enter the quantity you want:");
			 int a1 = sa.nextInt();
			 
			 buys(ds,a1);
			 
		} else {
			
			
			 for (String st : vv) {
					System.out.println(st);
			 }
			 
			 System.out.println("select the product to sell :");
			 String a1 = sa.next();
			 System.out.println("enter the quantity to sell :");
			 int gg = sa.nextInt();
			
			 Sells(a1,gg);
		}
	}

}
