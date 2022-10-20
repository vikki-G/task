package sam;

import java.util.Arrays;
import java.util.HashMap;

public class Acc {
	public static void main(String[] args) {
		int[] arr = { 2,4, 5, 6, 7, 6, 2, 5, 4, 3,4 };

		HashMap<Integer, Integer> as = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			int value = arr[i];

			if (as.containsKey(value)) {
				int count = as.get(value);
				as.put(value, count + 1);

			} else {
				as.put(value, 1);
			}
		}

		System.out.println(as);
	}

}
