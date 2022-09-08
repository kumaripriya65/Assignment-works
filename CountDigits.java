package question2;

import java.util.Scanner;

public class CountDigits {

	public static int CountDigits(int n){
		
		int count=0;
		while(n!=0) {
			n/=10;
			++count;
		}
           return count;
	}
           public static void main(String args[]) {
        	   Scanner scanner=new Scanner(System.in);
        	   System.out.println("Enter a Positive number:");
        	   int n=scanner.nextInt();
        	   System.out.println("Number of digits:"+CountDigits(n));
        	   
        	   
           }
}
