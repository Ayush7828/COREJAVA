package NestedLoop;

import java.util.Iterator;
import java.util.Scanner;

public class Pattern4 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number ");
	int num=sc.nextInt();
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=num;j++) {
			if(j<=6-i)
				System.out.printf("%d",j);
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}


//12345
//1234 
//123  
//12   
//1    
