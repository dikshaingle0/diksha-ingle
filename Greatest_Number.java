//WAP to accept 3 nofrom the user and find out the greatest
package corejava;

import java.util.Scanner;

public class Greatest_Number 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number 1");
		
		//taking input from user
		Scanner sc = new Scanner(System.in);
		double Number1 = sc.nextDouble();
		
		System.out.println("Enter the Number 2");
		double Number2 = sc.nextDouble();
		
		System.out.println("Enter the Number 3");
		double Number3 = sc.nextDouble();
		
		if(Number1>Number2&& Number1>Number3)
		{
			//printing the result
			System.out.println("Number1 is greater = "+Number1);
		}
		else if(Number2>Number1 && Number2>Number3)
		{
			//printing the result
			System.out.println("Number2 is greater ="+ Number2);
		}
		else
		{
			//printing the result
			System.out.println("Number3 is grater = "+Number3);
		}
		
		
		
	}
}
