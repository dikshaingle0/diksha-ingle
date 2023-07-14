//WAP to Accept age and check eligible for voting or not

package corejava;

import java.util.Scanner;

public class Age_Eligible 
{
	 {

			System.out.println("Enter the Age to check for eligible of voting or not");
	         
			//taking input from user
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
	       
			//checking the condition of age
			if (age >= 18) {
				System.out.println("Welcome, you are eligible for vote");
			} else {
				System.out.println("Sorry, you are not eligible for vote ");
			}
		}
}
