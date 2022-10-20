package oct12;

import java.util.ArrayList;
import java.util.Scanner;

public class Supermart {
	static ArrayList<String> products= new ArrayList<>();
	public static void main(String[] args) {
	
    Scanner sa = new Scanner(System.in);
    System.out.println("enter number of products");
    int num = sa.nextInt();
    int a = 0;
    while (num>a) {
		a++;
		String in = sa.next();
		products.add(in);	
	}
    System.out.println(products);
    Chat c = new Chat();
    c.start();
	
	}
}
class Chat extends Thread{
		public void run() {
			 ArrayList<String> arr = new ArrayList<>();
			 arr.add("pani puria");
			 arr.add("Sev Puri");
			 arr.add("Aloo Chaat");
			 arr.add("Bhelpuri");
			 for (int i = 0; i < arr.size(); i++) {
				 
				if (Supermart.products.contains(arr.get(i))) {
					System.out.println(arr.get(i));
				}
			}
		}
		
	}

		