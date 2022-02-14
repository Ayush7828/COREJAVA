package functions;

import java.util.Scanner;

public class Function_print_name {
	//write function 
	public static void printname(String name) {
		System.out.println(name);
	}

   public static void main(String[] args) {
	   Scanner sc =new Scanner(System.in);
	System.out.println("Enter a name ");
	String name=sc.nextLine();
	printname(name);
}
}
