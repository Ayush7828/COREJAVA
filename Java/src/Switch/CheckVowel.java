package Switch;

import java.util.Scanner;

public class CheckVowel {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);

   System.out.println("Enter a char ");
	char ch=sc.next().charAt(0);
	
	switch(ch) {
	case 'a':
	case 'e':
	case 'u':
	case 'i':
	case 'o':
		System.out.println("Vowel "+ch);
		break;
		default:
			System.out.println("Consonant "+ch);
			break;
	}
   
}
}
