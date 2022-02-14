package Decision_Control;

import java.util.Scanner;

public class Positive_Negative_Zero {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println("It is positive number "+num);
		}
		else if(num<0) {
		 System.out.println("It is negative number "+num);
		}
		else {
			System.out.println("Zero Number ");
		}
		
		
	}

}
