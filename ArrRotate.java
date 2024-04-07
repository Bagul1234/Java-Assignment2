package Assignment2;

import java.util.Scanner;

public class ArrRotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[], size;
		System.out.println("enter the size of array");
		size = sc.nextInt();

		arr = new int[size];
		System.out.println("enter the array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("given arr");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			int temp = arr[arr.length - 1];
			for (int j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;

			System.out.print("\nright rotated:");
			for (int k = 0; k < size; k++) {
				System.out.print(arr[k] + " ");
			}

		}

	}

}


