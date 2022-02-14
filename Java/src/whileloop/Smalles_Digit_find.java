package whileloop;

import java.util.Scanner;

public class Smalles_Digit_find {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	  System.out.println("Enter a number ");
	  int num=sc.nextInt(),small=9,remainder=0;
	  
	  while(num>0) 
	  {
		  remainder=num%10;
		  if(remainder<small)
		  {
			  small=remainder;
		  }
		  num/=10;
		  
	  }
	  System.out.println("Small Digits show = "+small);
	}

}
