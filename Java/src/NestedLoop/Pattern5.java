package NestedLoop;

import java.util.Scanner;

public class Pattern5 {
  public static void main(String[] args) 
  {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	for(int i=1;i<=num;i++) 
	{
		for(int j=1;j<=num;j++)
		{
			System.out.printf("%d ",j);
		}
		System.out.println();
	}
}
}


//1 2 3 4 5 
//1 2 3 4 5 
//1 2 3 4 5 
//1 2 3 4 5 
//1 2 3 4 5 
