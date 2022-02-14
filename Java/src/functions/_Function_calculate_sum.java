package functions;

import java.util.Scanner;

public class _Function_calculate_sum {
	// write sum function 
	public static int sum(int a,int b) {
		return a+b;
		
	}
	
	
	
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
   System.out.println("Enter a two number ");
   int a=sc.nextInt(),b=sc.nextInt();
   int ans=sum(a,b);
   System.out.println("Sum ="+ans);
}
}
