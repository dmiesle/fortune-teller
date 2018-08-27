import java.util.Scanner;
import java.time.Month;

public class fortuneteller {

	public static void main(String[] args) {
//variables
//		String firstName = "";
//		String lastName = "";
//		String age = "0";
//		String birthMonth = "0";
//		String favoriteColor = "";
//		String siblings = "0";
//questions
//		System.out.println("What is your first name?");
//		System.out.println("What is your last name?");
//		System.out.println("What is your age?");
//		System.out.println("What is your birth month as a number (for example if you were born in March type 3?");
//		System.out.println("What is your favorite ROYGBIV color?");
//		System.out.println("How many siblings do you have?"); // trap for question what is a sibling
//function core

		Scanner input = new Scanner(System.in);
//first name

		System.out.println("What is your first name?");
		String firstName = input.nextLine();

//last name

		System.out.println("What is your last name?");
		String lastName = input.nextLine();

//age
		System.out.println("What is your age?");
		String age = input.nextLine();
		double ageAsNumber = Double.parseDouble(age);

//birth month 
		System.out.println("What is your birth month?");
		String birthMonth = input.nextLine();
		int monthlength = birthMonth.length();
		if (monthlength > 2) {
			String birthUpper = birthMonth.toUpperCase();
			Month birthAsNumber = Month.valueOf(birthUpper);
		} else {
			double birthAsNumber = Double.parseDouble(birthMonth);
		}

//Favorite color
		System.out.println("What is your favorite ROYGBIV color?");
		String favoriteColor = input.nextLine();
		while (!favoriteColor.equals ("red") || !favoriteColor.equals("orange") || !favoriteColor.equals("yellow")
				|| !favoriteColor.equals("green") || !favoriteColor.equals("blue") || !favoriteColor.equals("indigo")
				|| !favoriteColor.equals("violet"))
			if (favoriteColor.equals("Help") || favoriteColor.equals("help") || favoriteColor.equals("HELP")) {
				System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
				favoriteColor = input.nextLine();
			}
			else if	(favoriteColor.equals ("red") || favoriteColor.equals("orange") || favoriteColor.equals("yellow")
						|| favoriteColor.equals("green") || favoriteColor.equals("blue") || favoriteColor.equals("indigo")
						|| favoriteColor.equals("violet"))
			break;
			else {
				System.out.println("You need to enter your favorite ROYGBIV color, not something else.");
				favoriteColor = input.nextLine();}
		
//siblings
		System.out.println("How many siblings do you have?");
		String siblings = input.nextLine();
		double siblingsAsNumber = Double.parseDouble(siblings);

//final return *[First Name]* *[Last Name]* will retire in *[# of years]* with *[bank balance]* in the bank, a vacation home in *[location]*, and travel by *[mode of transporation]*.
		System.out.println(firstName + " " + lastName + " " + ageAsNumber + " "+ birthAsNumber + " " + favoriteColor + " "+ siblingsAsNumber);
		input.close();
	}

}
