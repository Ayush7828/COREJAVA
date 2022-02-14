package functions;

import java.util.Scanner;

public class Fibonnaci_Series {
	// fiboanni series 
	public static int fibonacci(int num) {
		int t1=0;
		int t2=1;
		int t3;
		for(int i=1;i<=num;i++) {
			t3=t1+t2;
			System.out.println("print=="+t3);
			t1=t2;
			t2=t3;
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		int ans=fibonacci(num);
		System.out.println("Fibonnaci series "+ans);
	}

}
