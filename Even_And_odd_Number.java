//WAP to accept a no from the user and check it is even or odd
package corejava;
import java.util.Scanner;

public class Even_And_odd_Number 
{
	//Main Driver Method
		public static void main(String[] args) 
		{
			System.out.println("Enter the Number to know the Number is even of odd");
			
			//Taking input from user
			Scanner sc = new Scanner(System.in);
			int number = sc.nextInt();
			
			//checking the condition if number is even or odd number via remainder
			
			if(number%2 ==0)
			{
				System.out.println("Entered Number is Even");
			}
			else
			{
				System.out.println("Entered Number is odd");
			}
			
			
			
		}

}
