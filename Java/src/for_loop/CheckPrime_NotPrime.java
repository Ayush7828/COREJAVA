package for_loop;

import java.util.Scanner;

public class CheckPrime_NotPrime {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number ");
	int num=sc.nextInt(),c=0;
	for(int i=1;i<num;i++) {
		if(i%2==0) {
			System.out.println("Not prime");
			c+=1;
			break;
		}
	}
	if(c==0) {
		System.out.println("Prime number ");
	}
}
}
