package NestedLoop;

import java.util.Scanner;

public class Pattern7 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number ");
	int num=sc.nextInt();
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=num;j++) {
			if(j<=i)
				System.out.printf("%d",i);
			else
				System.out.print(" ");
		}
		System.out.println();
	}
}
}


//1    
//22   
//333  
//4444 
//55555