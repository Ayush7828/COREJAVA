package Basic;

import java.util.Scanner;

public class SwapTwoNumber_WithoutUseThirdVariable {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a two variable ");
	int a=sc.nextInt(),b=sc.nextInt();
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("After swapping "+a+" "+b);
	
	
}
}
