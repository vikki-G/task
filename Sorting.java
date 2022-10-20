
public class Sorting {
	public static void main(String[] args) {

		int temp = 0;
		int arr[][] = { { 20, 30, 10 }, { 15, 200, 115 }, { 300, 55, 80 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				for (int k = 0; k < arr.length; k++) {
					for (int l = 0; l < arr[k].length; l++) {
						
						if (arr[k][l] > arr[i][j]) {
							temp = arr[i][j];
							arr[i][j] = arr[k][l];
							arr[k][l] = temp;

						}

					}
				}

			}

		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
