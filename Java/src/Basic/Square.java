package Basic;

import java.util.Scanner;

public class Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num=sc.nextInt();
		long area=num*num;
		System.out.println("Square number "+area);
		System.out.println("Congrulation");
	}

}
