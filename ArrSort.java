package Assignment2;
import java.util.Scanner;
public class ArrSort {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int arr[],size,mid;
			System.out.println("enter the size of array");
			size=sc.nextInt();
			mid=size/2;
			arr=new int[size];
			System.out.println("enter the array");
		    for(int i=0;i<size;i++) {
		    	arr[i]=sc.nextInt();
		    }
		    
		    for(int i=0;i<size;i++) {
		    	for(int j=i+1;j<size;j++) {
		    		if(arr[i]>arr[j]) {
		    			int temp=arr[i];
		    			arr[i]=arr[j];
		    			arr[j]=temp;
		    		}
		    		
		    	}
		    }
		    
		    for(int i=0;i<mid;i++) {
		    	System.out.print(arr[i]+" ");
		    }
		    for(int i=arr.length-1;i>=mid;i--) {
		    	System.out.print(arr[i]+" ");
		    }
			
		}

	}

