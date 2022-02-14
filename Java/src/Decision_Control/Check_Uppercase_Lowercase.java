package Decision_Control;

import java.util.Scanner;

public class Check_Uppercase_Lowercase {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a character ");
	char ch=sc.next().charAt(0);
	if(ch>='a'&&ch<='z') {
		System.out.println("This is lowercase ");
	}
	else if(ch>='A'&&ch<='Z') {
		System.out.println("This is uppercase");
	}
	else {
		System.out.println("Invaild input");
	}
}
}
