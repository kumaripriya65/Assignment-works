package question2;

import java.lang.*;
import java.util.Scanner;

class Main
{
	public static void main(String args[])
	{
		int firstnum,secondnum;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter first number");
		firstnum=s.nextInt();
		System.out.println("Enter Second number which should be greater than first number");
		secondnum=s.nextInt();
		
		int sum=0;
		System.out.println("even numbers are:");
		int i=firstnum;
		while(i<=secondnum)
		{
			
			if(i%2==0)
			{
				System.out.println(i + " ");
				sum=sum+i;
			}
			i++;
		}
		System.out.println();
		System.out.println("Sum of even numbers are="+sum);
		
	    int oddsum=0;
		System.out.println("odd numbers are:");
		while(firstnum<=secondnum)
		{
			
			if(firstnum%2!=0)
			{
				System.out.println(firstnum+"");
				oddsum=oddsum+firstnum;
			}
			firstnum++;
		}
		System.out.println();
		System.out.println("Sum of even numbers are="+oddsum);
	}
}