package Decision_Control;

import java.util.Scanner;

public class CheckArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a nunber ");
		int n=sc.nextInt(),h,t,u,s;
		h=n/100;
		t=(n/10)*10;
		u=n%10;
		s=(u*u*u)+(h*h*h)+(t*t*t);
		if(n==s) {
			System.out.println("it is Armstrong "+n);
		}
		else {
			System.out.println("it is not a  armstrong "+n);
		}
		
	}

}
