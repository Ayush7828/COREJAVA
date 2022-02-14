package Basic;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a base and height ");
		int b=sc.nextInt(),h=sc.nextInt();
		float area =(b*h)/2f;
		System.out.println("Area of triangle = "+area);
		
	}

}
