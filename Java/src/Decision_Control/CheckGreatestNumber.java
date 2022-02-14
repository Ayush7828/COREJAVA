package Decision_Control;

import java.util.Scanner;

public class CheckGreatestNumber {
  public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a three number ");
	int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
	if(a>b&&a>c) {
		System.out.println("A i greater "+a);
	}
	else if(b>a&&b>c) {
		System.out.println("B is greater "+b);
	}
	else {
		System.out.println("C is greater "+c);
	}
}
}
