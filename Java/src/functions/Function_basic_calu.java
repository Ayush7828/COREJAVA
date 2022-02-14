 package functions;

import java.util.Scanner;

public class Function_basic_calu {
	// write functions 
	public static int sum(int a, int b) {
		int ans=a+b;
		System.out.println("Sum ="+ans);
		return ans;
	}
	
	public static int subtract(int a, int b) {
		int ans1=a-b;
		System.out.println("Subtract ="+ans1);
		return ans1;
		
	}
	public static int mul(int a,int b) {
		int multiply=a*b;
		System.out.println("Multiply = "+multiply);
		return multiply;
	}
	public static int divide(int a,int b) {
		int div=a/b;
		System.out.println("Divide = "+div);
		return div;
		
	}
	public static int modules(int a,int b) {
		int mod=a%b;
		System.out.println("Modules= "+mod);
		return mod;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	   System.out.println("Enter a two number ");
	   int a=sc.nextInt(),b=sc.nextInt();
	   sum(a,b);
	   subtract(a,b);
	   mul(a,b);
	   divide(a,b);
	   modules(a,b);
	   
	}

}
