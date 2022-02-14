package Decision_Control;

import java.util.Scanner;

public class Pallidrome {
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Entner a number ");
		int num=sc.nextInt();
		if(num/100==num%10) {
			System.out.println("It is pallidrome "+num);
		}
		else {
			System.out.println("it is not a palliforme "+num);
		}
	}
}
