package for_loop;

import java.util.Scanner;

public class SumOfNaturalNumber {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number ");
	int num=sc.nextInt(),sum=0;
	for(int i=1;i<=num;i++) {
		sum=sum+i;
		System.out.println("Sum of natural number "+sum);
		
	}
	
}
}
