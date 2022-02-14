package Basic;

import java.util.Scanner;

public class SwapTwoNumber {
	public static void main(String[] args) {
		
		// swap program using third variable 
		Scanner sc =new Scanner(System.in);
	     System.out.println("Enter a two number ");
	     int a=sc.nextInt(),b=sc.nextInt();
	     int temp=a;
	     a=b;
	     b=temp;
	     System.out.println("After swapping "+a+" "+b);
	}

}
