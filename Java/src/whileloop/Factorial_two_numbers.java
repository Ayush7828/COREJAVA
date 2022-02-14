package whileloop;

import java.util.Scanner;

public class Factorial_two_numbers {
public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter a number ");
	  int num=sc.nextInt(),fact=1;
	  while(num>0) {
		  fact=fact*num;
		  num--;
	  }
	  System.out.println("Fctorial = "+fact);
}
}
