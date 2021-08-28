/*-------------------------------------------------------------
 * // AUTHOR: MORRIS, CHRIS
 * // FILENAME: Lab2.java
 * // SPECIFICATION: STRINGS PROGRAM, RETURNS FULL NAME, CHARACTER LENGTH AND COMPARISONS
 * // FOR: CSE 110 -Lab #2
 * // TIME SPENT: 1hr 5mins
 * //-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab2 
{
	public static void main(String[] args) 
	{
		String firstName, lastName, fullName = "";
		int nameLength = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter first name: ");
		firstName = scan.nextLine();
		
		System.out.println("Please enter last name: ");
		lastName = scan.nextLine();
		
		fullName = (firstName + " " + lastName).toUpperCase();
		
		nameLength = fullName.length();
		
		System.out.println("Full name (in capitals): " + fullName);
		System.out.println("Length of full name: " + nameLength);
		
		String title1 = new String("cse110");
		String title2 = "cse110";
		
		if(title1 == title2) 
		{
			System.out.println("String comparison using the \"==\" works");
		}else
		{
			System.out.println("String comparison using \"==\" does NOT work");
		}
		
		if(title1.equals(title2)) 
		{
			System.out.println("String comparison using \"equals\" method works");
		}
		else
		{
			System.out.println("String comparison using \"equals\" method does NOT work");
		}
	}
}
