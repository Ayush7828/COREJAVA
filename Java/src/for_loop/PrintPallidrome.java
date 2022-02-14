package for_loop;

import java.util.Scanner;

public class PrintPallidrome {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number ");
	int num=sc.nextInt();
	for(int i=1;i<num;i++) {
		if(i/100==i%10) {
			System.out.println("pallidorme number "+i);
		}
	}
	
}
}
