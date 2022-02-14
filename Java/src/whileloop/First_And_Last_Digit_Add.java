package whileloop;

import java.util.Scanner;

public class First_And_Last_Digit_Add {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number ");
	int num=sc.nextInt(),sum=0,first;
			int last;
	if(num>10) {
		last=num%10;
	}
	while(num>=10) {
		num/=10;
	}
	first=num;
	sum=first+last;
	System.out.println("first and last digit add "+sum);
	
}
}
