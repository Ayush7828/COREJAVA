package for_loop;

import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt(),h,t,u,s;
	for(int i=1;i<num;i++) {
		h=i/100;
		t=(i/10)%10;
		u=i%10;
		s=(u*u*u)+(t*t*t)+(h*h*h);
		if(i==s) {
			System.out.println("armstrong number "+s);
		}
	}
}
}
