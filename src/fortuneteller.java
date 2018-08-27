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
		double birthAsNumber;
		int monthlength = birthMonth.length();
		if (monthlength > 2) {
			String birthUpper = birthMonth.toUpperCase();
			Month birthNumber = Month.valueOf(birthUpper);
			birthAsNumber = birthNumber.getValue();
		} else {
			birthAsNumber = Double.parseDouble(birthMonth);
		}

//Favorite color
		System.out.println("What is your favorite ROYGBIV color?");
		String favoriteColor = input.nextLine();
		while (!favoriteColor.equals("red") || !favoriteColor.equals("orange") || !favoriteColor.equals("yellow")
				|| !favoriteColor.equals("green") || !favoriteColor.equals("blue") || !favoriteColor.equals("indigo")
				|| !favoriteColor.equals("violet"))
			if (favoriteColor.equals("Help") || favoriteColor.equals("help") || favoriteColor.equals("HELP")) {
				System.out.println("The ROYGBIV colors are red, orange, yellow, green, blue, indigo, violet.");
				favoriteColor = input.nextLine();
			} else if (favoriteColor.equals("red") || favoriteColor.equals("orange") || favoriteColor.equals("yellow")
					|| favoriteColor.equals("green") || favoriteColor.equals("blue") || favoriteColor.equals("indigo")
					|| favoriteColor.equals("violet"))
				break;
			else {
				System.out.println("You need to enter your favorite ROYGBIV color, not something else.");
				favoriteColor = input.nextLine();
			}

//siblings
		System.out.println("How many siblings do you have?");
		String siblings = input.nextLine();
		double siblingsAsNumber = Double.parseDouble(siblings);

//final return *[First Name]* *[Last Name]* will retire in *[# of years]* with *[bank balance]* in the bank, a vacation home in *[location]*, and travel by *[mode of transporation]*.
//test variables		System.out.println(firstName + " " + lastName + " " + ageAsNumber + " "+ birthAsNumber + " " + favoriteColor + " "+ siblingsAsNumber);

//exceeds or fails to meet a reasonable age
		
		if (ageAsNumber > 70 && ageAsNumber <120) {
			System.out.println(firstName + " " + lastName + ", you are already retired. Enjoy your life and stop worring about the future. Unless you go back to school and start a new carrer you have what you have");
			System.exit(0);
		}
		else if (ageAsNumber >=120 && ageAsNumber <= 200000) {
			System.out.println(firstName + " " + lastName + " you are long dead. Tell me why you are so interested in this program? Why don't you tell me your fortune?");
			System.exit(0);
		}
		else if (ageAsNumber >200000) {
			System.out.println("Winter is coming.");
			System.exit(0);
		}
		else if (ageAsNumber <= 0) {
			System.out.println(firstName + " " + lastName + " , you do not exist. Therefore time is irrellevant, as are fortunes.");
			System.exit(0);
		}
//values for retirement years based on age
		double retirementAge = (70 - ageAsNumber);

//values for vacation home
		int siblingsInt = (int) siblingsAsNumber;
		if (siblingsInt > 5) {
			siblingsInt = 6;
		}
		String siblingsString;
		switch (siblingsInt) {
		case 1: 
			siblingsString = "Boca Raton, Florida with your parents.";
			break;
		case 2: 
			siblingsString = "Branson, Missouri.";
			break;	
		case 3: 
			siblingsString = "Deep Creek Lake, Maryland.";
			break;
		case 4: 
			siblingsString = "Denver, Colorado.";
			break;
		case 5: 
			siblingsString = "Biloxi, Mississipi.";
			break;
		case 6: 
			siblingsString = "Gallway, Ireland";
			break;	
		}
		
		//end
		input.close();
	}

}
