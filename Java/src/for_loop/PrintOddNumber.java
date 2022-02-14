package for_loop;

import java.util.Scanner;

public class PrintOddNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt(),i;
		for(i=0;i<num;i++) 
		{
			if(i%2!=0) {
				System.out.println("ODd NUMBER = "+i);
			
				
			}
			
			
		}
		
	}

}
