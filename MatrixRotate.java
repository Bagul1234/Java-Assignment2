package Assignment2;

import java.util.Scanner;

public class MatrixRotate {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int arr[][], size,size2,tarr[][];
			System.out.println("enter the m*n size of array");
			size = sc.nextInt();
	        size2=sc.nextInt();
			arr = new int[size][size2];
			tarr = new int[size][size2];
			System.out.println("enter the array");
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size2; j++) {
					arr[i][j]=sc.nextInt();
				}
			}
			
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size2; j++) {
					 System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
			//transpose 
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size2; j++) {
					tarr[j][i]=arr[i][j];
				}
			}
			System.out.println("transpose of  matrix");
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size2; j++) {
					 System.out.print(tarr[i][j]+" ");
				}
				System.out.println();
			}
			//reverse row
			for (int i = 0; i < size; i++) {
				int temp=tarr[i][0];
				for (int j = 0; j < size2-1; j++) {
					
					tarr[i][j]=tarr[i][j+1];
				}
			   tarr[i][size2-1]=temp;
			}
			
			System.out.println("90 degree rotation  of  matrix");
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size2; j++) {
					 System.out.print(tarr[i][j]+" ");
				}
				System.out.println();
			}

		}

	}


