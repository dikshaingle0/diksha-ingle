//WAP to accept R from the user and calculate Ac and CC
   package corejava;
   import java.util.Scanner;

   public class Area_of_circle_and_circumstance
  {
	public static void main(String[] args) 
	{
          System.out.println("Enter the radius of circle");
          
          //Taking input from user
          Scanner sc = new Scanner(System.in);
          
          double radius = sc.nextDouble();
         
          // storing the area of circle in new reference variable 
          double  circle_area = 2*3.24*radius*radius;
          
          System.out.println("Area of Circle ="+circle_area);
          
          // storing the circumference of circle in new reference variable 
          double circle_circumference = 2*3.14*radius;
          
          System.out.println("Circumference of Circle = "+circle_circumference);
	
	}

}
