package Basic;

import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  a principle , rate and time ");
		int p=sc.nextInt(),r=sc.nextInt(),t=sc.nextInt();
		float si=(p*r*t)/100f;
		System.out.println("Simple interest ="+si);
	}

}
