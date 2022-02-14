package for_loop;

import java.util.Scanner;

public class Calculate_Table {
	public static int power(int num) {
		for(int i=1;i<=10;i++) {
			int table=num*i;
			System.out.println("table ="+table);
			
		}
		return 1;
	}
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a number ");
	int num=sc.nextInt();
	power(num);
	
}
}
