package Switch;

import java.util.Scanner;

public class CalculateArea {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a s ,r ,c select one ");
		char ch=sc.next().charAt(0);
		int l,b,r,area;
		switch(ch) {
		case 's':
			System.out.println("Enter a number ");
			int num=sc.nextInt();
			area=num*num;
			System.out.println("Area of square is = "+area);
			break;
			
		case 'c':
			System.out.println("Enter a radius value ");
			r =sc.nextInt();
			area=r*r;
			System.out.println("Area of circle "+area);
			
			break;
			
		case 'r':
			System.out.println("Enter a lenght and breadth ");
			l=sc.nextInt();
			b=sc.nextInt();
			area=l*b;
			System.out.println("Area of rectangle "+area);
			
			break;
			
			default:
				System.out.println("Invaild input choice ");
				break;
			
		}
	}

}
