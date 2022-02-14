package whileloop;

import java.util.Scanner;

public class Largest_digit_find {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Entera number ");
		int num=sc.nextInt(),large=0,remainder=0;
		
		while(num>0) {
			remainder=num%10;
			if(remainder>large) {
				large=remainder;
			}
			num/=10;
		}
		System.out.println("Find largest digit "+large);
		
	}

}
