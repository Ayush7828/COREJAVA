package functions;

import java.util.Scanner;

public class Function_calculate_factorial {
	// write function 
	public static int fact(int num) {
		int factorial=1;
		for(int i=1;i<=num;i++) 
		{
			factorial=factorial*i;
			System.out.println("Fctorial ="+factorial);
			
		}
		return factorial ;
	}
		
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.print("enter a number ");
	int num=sc.nextInt();
	fact(num);
	
}
}
