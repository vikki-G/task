package exc;

import java.util.Scanner;

public class Inssort {

	
		 Inssort(int arr[])
		{
			int n = arr.length;
			for (int i = 1; i < n; ++i) {
				int key = arr[i];
				int j = i - 1;

				
				while (j >= 0 && arr[j] > key) {
					arr[j + 1] = arr[j];
					j = j - 1;
				}
				arr[j + 1] = key;
			}
		

		
		
			 n = arr.length;
			for (int i = 0; i < n; ++i)
				System.out.print(arr[i] + " ");

			System.out.println();
		}

		
		public static void main(String args[])
		{
			int n;
			System.out.println("Enter the length of the array");
			Scanner s= new Scanner(System.in);
			n=s.nextInt();			
			
			int arr[]=new int[n];
			System.out.println("Enter the Array Elements");
			
			for(int i=0;i<n;i++)
			{
				arr[i]=s.nextInt();
			}

			System.out.println("Array before sorting");
			
			for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
			}
			
			System.out.println();
			
			Inssort ob = new Inssort(arr);
			
            
			System.out.println("Array after sorting");
			
		}
	} 

	

