//WAP using switch case which will disply the option of all operators
package corejava;
import java.util.Scanner;

public class Switch_Case
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Arithmatic Operator");
		System.out.println("2.Relational Operator");
		System.out.println("3.Logical Operator");
		System.out.println("4.Bitwise Operator");
		System.out.println("5.Unary Operator");
		
		
		int choice  = sc.nextInt();
		
		switch (choice) 
		{
		case 1:
			
			System.out.println("Arithmatic Operator");
			System.out.println("Adding,substracation,multiplicaton of two Number");
			System.out.println("Enter the number1"); 
			double number1 = sc.nextDouble();
			System.out.println("Enter the number2");
			double number2 = sc.nextDouble();
			
			System.out.println("Addition = "+(number1+number2));
			
			System.out.println("subtracation = "+(number1-number2));
			
			System.out.println("Addition = "+(number1*number2));
			
			break;
			
		case 2:
			
			System.out.println("Relational Operator");
			System.out.println("Positive and Negative Nubmber");
			
			System.out.println("Enter the Number to know positive and Negative");
			int number = sc.nextInt();
			
			if(number >= 0)
			{
				System.out.println(number +"is a Positive number");
			}
			else
			{
				System.out.println(number +"is a Negative number");
			}
			break;
			
		case 3 :
			
			System.out.println("Logical Operator");
			System.out.println("checking condition true and false");
			
			System.out.println("enter the first number");
			int num1 = sc.nextInt();
			System.out.println("enter the second number");
			int num2 = sc.nextInt();
			
			int sum = num1 +num2;
			
			if(num1>num2 && sum>num1)
			{
				System.out.println("true");
			}
			else if(num1<num2 ||  sum<num2 ) 
			{
				System.out.println("false");
			}
	
			break;
			
		case 4 : 
			
			System.out.println("Bitwise Operator");
			System.out.println("Bitwise AND and OR ");
			
			System.out.println("Enter the number1 ");
			int n1 = sc.nextInt();
			System.out.println("Enter the number2 ");
			int n2 = sc.nextInt();
			
			System.out.println("Bitwise AND : ="+ (n1 & n2));
			System.out.println("Bitwise OR : ="+ (n1 | n2));
			
           break;
           
		case 5 : 
			System.out.println("Unary Operator");
			 
			System.out.println("post-increment and pre-increment ");
			
			System.out.println("Enter the Number to know post-increment and pre-increment");
			int firstnum = sc.nextInt();
			
			System.out.println("post-increment ="+ (firstnum++));
			System.out.println("pre-increment ="+ (++firstnum));
			
			
           
		default:
			break;
		}
		
		
	}
}
