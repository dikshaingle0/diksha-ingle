//WAP a program to accept a no from the user and display the multiplication table(5*1=5)

package corejava;
import java.util.Scanner;

public class Multiplication_Table
{
			public static void main(String[] args)
			
			{
				System.out.println("Enter the Number to find out the table");

				// taking input from the user
				Scanner sc = new Scanner(System.in);
				int number = sc.nextInt();

				for (int i = 1; i <= 10; i++) 
				{
					// printing table of the entered number
					System.out.println(number + "*" + i + "=" + number * i);
				}
			}



}
