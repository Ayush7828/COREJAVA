package Basic;

import java.util.Scanner;

public class Average {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter a three number ");
    	 int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
    	 int sum = a+b+c;
    	 System.out.println("Sum = "+sum);
    	 
    	 float avg= sum/3f;
    	 System.out.println("Average = "+avg);
    	 
     }
     
}
