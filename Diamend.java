package sep23;

import java.util.Scanner;

public class Diamend {
	public static void main(String[] args) {
		int n, i,j; int space = 1;
		System.out.println("enter the number of rows");
		Scanner s =new Scanner(System.in);
		n = s.nextInt();
		space = n-1;
		for ( j = 0; j <=n; j++) {
			for (i = 0;  i<=space; i++) {
				System.out.print(" ");	
			}
			space--;
			for (i= 1; i <= 2*j-1; i++) {
				System.out.print("*");
				
			}
			System.out.println("");
			
		}
		space=1;
		for (j = 1; j <= n-1; j++) {
			for (i =1; i <= space; i++) {
				System.out.print(" ");
				
			}
			space++;
			for (i = 1; i <=2*(n-j); i++) {
				System.out.print("*");
				
			}
			System.out.println("");
			
		}
		
		
		
	}

}
