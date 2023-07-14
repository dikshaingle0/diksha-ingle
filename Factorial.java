//WAP to accept a no from the user and find the factorial
package corejava;
import java.util.Scanner;
public class Factorial 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number of find our the factorial");
		
		Scanner sc = new Scanner(System.in);
		
		int Number = sc.nextInt();
		
		//intialisition and Declaration of variable
		int fact = 1;
		
		//looping statement
		for(int i=1; i<=Number; i++)
		{
			fact = fact*i;
		}
		
		
		System.out.println("Factorial of "+Number +" is "+fact);
		
	}
}
