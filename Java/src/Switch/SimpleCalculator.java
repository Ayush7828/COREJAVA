package Switch;

import java.util.Scanner;

public class SimpleCalculator {
  public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a choice ");
	char ch=sc.next().charAt(0);
	System.out.println("Enter a two number ");
	int a=sc.nextInt(),b=sc.nextInt(),c;
	switch(ch) {
	case '+':
		c=a+b;
		System.out.println("SUM = "+c);
		break;
		
	case '-':
		c=a-b;
		System.out.println("Subtract ="+c);
		break;
	case '*':
		c=a*b;
		System.out.println("Multiply = "+c);
		break;
		
	case '/':
		c=a/b;
		System.out.println("Divide = "+c);
		break;
		
		default:
			System.out.println("Invaild choice ");
			break;
			
		
	}
}
}
