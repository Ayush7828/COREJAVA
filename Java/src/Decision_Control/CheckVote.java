package Decision_Control;

import java.util.Scanner;

public class CheckVote {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	System.out.println("Enter a  age ");
	int age=sc.nextInt();
	if(age>18) {
		System.out.println("You are eligible for voting "+age);
	}
	else {
		System.out.println("You are not eligible for voting "+age);
	}
}
}
