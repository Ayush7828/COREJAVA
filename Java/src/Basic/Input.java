package Basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Input {
  public static void main(String[] args) throws Exception {

	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
	  
	  int a=Integer.parseInt(br.readLine());
	  int b=Integer.parseInt(br.readLine());
	  int ans=a+b;
	  System.out.println("Sum = "+ans);
	  
}
}
