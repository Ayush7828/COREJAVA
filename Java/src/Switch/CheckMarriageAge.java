package Switch;

import java.util.Scanner;

public class CheckMarriageAge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 0 for women and 1 for men  choice ");
		int num=sc.nextInt();
		System.out.println("Enter a age");
		int age=sc.nextInt();
   
      
    switch(num) {
    case 0:
    	if(age>21) {
    		System.out.println("Eligible for women marriage "+age);
    	}
    	else {
    		System.out.println("NOT eligible for women marriage "+age);
    	}
    	
    	break;
    	
    case 1:
    	if(age>24) {
    		System.out.println("Eligible for marraige men "+age);
    	}
    	else {
    		System.out.println("NOT eligible for men marriage "+age );
    	}
    	break;
    	
    	default:
    		System.out.println("Invaild input choice ");
    		break;
    }
		
    if(age>21) {
    System.out.println("Congrulation for your marriage ");
    }
		
		
	}

}
