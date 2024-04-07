package Assignment2;

import java.util.Scanner;

public class Factorial {
	 int fact=1;
		public int fact(int num) {
		    if(num>0) {
		    	
		     fact=num*fact(num-1);
		    	
		    }
		   return fact;
		
		  
		}

		public static void main(String[] args) {
			int fact,num;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the number");
			num=sc.nextInt();
			
	          Factorial factorial=new Factorial();
	          System.out.println("factorial of "+num +" is "+factorial.fact(num));
		}

	}


