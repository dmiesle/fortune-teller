import java.util.Scanner;
import java.time.Month;

public class fortuneteller {

	public static void main(String[] args) {

//function core

		Scanner input = new Scanner(System.in);
//first name input

		System.out.println("What is your first name?");
		String firstName = input.nextLine();

//last name input

		System.out.println("What is your last name?");
		String lastName = input.nextLine();

//age input
		System.out.println("What is your age?");
		String age = input.nextLine();
		double ageAsNumber = Double.parseDouble(age);

//birth month input
		System.out.println("What is your birth month?");
		String birthMonth = input.nextLine();
		double birthAsNumber;
		int monthLength = birthMonth.length();
		if (monthLength > 2) {
			String birthUpper = birthMonth.toUpperCase();
			Month birthNumber = Month.valueOf(birthUpper);
			birthAsNumber = birthNumber.getValue();
		} else {
			birthAsNumber = Double.parseDouble(birthMonth);
		}

//Favorite color input
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

//siblings input
		System.out.println("How many siblings do you have?");
		String siblings = input.nextLine();
		double siblingsAsNumber = Double.parseDouble(siblings);

//exceeds or fails to meet a reasonable age or month is beyond 12

		if (ageAsNumber > 70 && ageAsNumber < 120) {
			System.out.println(firstName + " " + lastName
					+ ", you are already retired. Enjoy your life and stop worring about the future. Unless you go back to school and start a new carrer, you have what you have.");
			System.exit(0);
		} else if (ageAsNumber >= 120 && ageAsNumber <= 200000) {
			System.out.println(firstName + " " + lastName
					+ ", you are long dead. Tell me why you are so interested in this program? Why don't you tell me my fortune?");
			System.exit(0);
		} else if (ageAsNumber > 200000) {
			System.out.println("Winter is coming.");
			System.exit(0);
		} else if (ageAsNumber <= 0) {
			System.out.println(firstName + " " + lastName
					+ ", you do not exist. Therefore time is irrellevant, as are fortunes.");
			System.exit(0);
		} else if (birthAsNumber > 12) {
			System.out.println(firstName + " " + lastName
					+ ", you are in jail for forging Federal Documents, and will die there penniless and alone.");
			System.exit(0);
		}
//values for retirement years based on age
		double retirementAge = (70 - ageAsNumber);

//values for bank balance
		String balance = "";
		if (birthAsNumber == 3) {
			balance = "$50,000,000";
		} else if (birthAsNumber == 9) {
			balance = "$4,567,890";
		} else if (birthAsNumber == 12) {
			balance = "$9,876,543";
		} else if (birthAsNumber == 1) {
			balance = "$0";
		} else if (birthAsNumber == 2) {
			balance = "$324,741";
		} else if (birthAsNumber > 3 && birthAsNumber < 9) {
			balance = "$185,453";
		} else if (birthAsNumber > 3 && birthAsNumber < 12) {
			balance = "$754,135";
		}

//values for vacation home
		int siblingsInt = (int) siblingsAsNumber;
		if (siblingsInt > 5) {
			siblingsInt = 6;
		}
		else if (siblingsInt <1) {
			siblingsInt = 7;
		}
		String siblingsString = "";
		switch (siblingsInt) {
		case 1:
			siblingsString = "Boca Raton, Florida with your parents";
			break;
		case 2:
			siblingsString = "Branson, Missouri";
			break;
		case 3:
			siblingsString = "Deep Creek Lake, Maryland";
			break;
		case 4:
			siblingsString = "Denver, Colorado";
			break;
		case 5:
			siblingsString = "Biloxi, Mississipi";
			break;
		case 6:
			siblingsString = "Gallway, Ireland";
			break;
		case 7:
			siblingsString = "the Center of a blackhole (because you were trying to be clever)";
			break;
		}
		
//Transportation options
		String transportation = "";
		if (favoriteColor.equals("red")){
			transportation = "Ford Fiesta";
		}	
		else if (favoriteColor.equals("orange")) {
			transportation = "Mule";			
		}
		else if (favoriteColor.equals("yellow")) {
			transportation = "Tesla X3";
		}
		else if (favoriteColor.equals("green")) {
			transportation = "Toyota Camery";
		}
		else if (favoriteColor.equals("blue")) {
			transportation = "Volkswagon Jetta";
		}
		else if	(favoriteColor.equals("indigo")) {
			transportation = "Lear Jet";
		}
		else if (favoriteColor.equals("violet")) {
			transportation = "Bicycle";
		}
//Final output Fortune
		System.out.println(firstName + " " + lastName + " will retire in " + retirementAge + " years with "+ balance + " in the bank, a vacation home in " + siblingsString + ", and travel by " + transportation + ".");
		// end
		input.close();
	}

}
