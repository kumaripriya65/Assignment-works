package question2;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		final int pwd=1234;
		int pin;
		
		 for(int i=0;i<3;i++)
		 {
             System.out.println("Please Enter Pin");
              Scanner s = new Scanner(System.in);
                     pin=s.nextInt();
                     if(pwd==pin)
                     {
                    	 System.out.println("Correct,Welcome back");
                    	  }
                     else
                     {
                    	 System.out.println("Incorrect Try again");
                    	 
                     }
		 }
		       System.out.println("Sorry but you have been locked out");

	}

}
