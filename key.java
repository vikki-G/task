package sep22;

import java.util.Arrays;
import java.util.Scanner;

public class key {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] a = { "venkat", "is", "software", "develper" };
		System.out.println("enter the word");
		String str = s.next();

		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(str)) {
				System.out.println("true");
			}
		}
	}
}
