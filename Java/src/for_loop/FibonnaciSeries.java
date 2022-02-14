package for_loop;

import java.util.Scanner;

public class FibonnaciSeries {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number ");
	int num=sc.nextInt();
	int t1=0;
	int t2=1;
	int t3;
	for(int i=1;i<num;i++) {
		t3=t1+t2;
		System.out.println("Fibonacci series = "+t3);
		t1=t2;
		t2=t3;
		
	}
	
}
}
