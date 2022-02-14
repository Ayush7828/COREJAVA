package for_loop;

import java.util.Scanner;

public class CalculatePower {

	public static void main(String[] args) {
		Scanner  sc =new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		System.out.println("Enter a exponent");
		int exponent=sc.nextInt();
		int power=1;
		for(int i=1;i<=exponent;i++) {
			power =power*num;
			System.out.println("Power = "+power);
			
		}
		
		
	}
}
