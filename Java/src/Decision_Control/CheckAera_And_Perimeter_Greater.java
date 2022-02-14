package Decision_Control;

import java.util.Scanner;

public class CheckAera_And_Perimeter_Greater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a length and breath");
		int length=sc.nextInt(),breadth=sc.nextInt();
		float area = length*breadth;
		System.out.println("Area of triangle = "+area);
		
		int perimeter = 2*(length*breadth);
		System.out.println("Perimeter = "+perimeter);
		
		if(area>perimeter) {
			System.out.println("Area is greater "+area+" "+perimeter);
		}
		else {
			System.out.println("Perimeter is greater "+area+" "+perimeter);
		}
	}

}
