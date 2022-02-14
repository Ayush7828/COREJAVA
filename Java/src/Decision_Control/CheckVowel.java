package Decision_Control;

import java.util.Scanner;

public class CheckVowel {
  public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a  character ");
	char ch=sc.next().charAt(0);
	if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='U'||ch=='I') {
		System.out.println("it is vowel "+ch);
	}
	else {
		System.out.println("it is consonant "+ch);
	}
}
}
