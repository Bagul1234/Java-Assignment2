package Assignment2;
import java.util.Scanner;
public class TestFabo {

		public static void main(String[] args) {
			FibonacciRec fibonacci1 = new FibonacciRec();
			
			Scanner sc = new Scanner(System.in);
			int n, a = 0, b = 1;
			System.out.println("enter the numer");
			n = sc.nextInt();
			
			
//			fibonacci1.fibonacciIteration();


//			System.out.print(a + " " + b);
//			fibonacci1.fibonacciRecursion( n-2);
			
			int arr[]=new int[n];
			arr[0]=0;
			arr[1]=1;
	        fibonacci1.fibonacciArray(arr, n);
		}

	}

