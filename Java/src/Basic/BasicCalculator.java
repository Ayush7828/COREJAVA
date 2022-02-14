package Basic;
import java.util.Scanner;
public class BasicCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a two number ");
		int a=sc.nextInt(),b=sc.nextInt();
		int sum=a+b;
		System.out.println("Sum = "+sum);
		int sub=a-b;
		System.out.println("Subtract = "+sub);
		int mul=a*b;
		System.out.println("Multiply "+mul);
		int divide=a/b;
		System.out.println("Divide "+divide);
		
		
		System.out.println("Congrulation !");
	
	}

}