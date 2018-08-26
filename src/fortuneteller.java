import java.util.Scanner;

public class fortuneteller {

	public static void main(String[] args) {
//variables
		double age = 0;
		double birthMonth = 0;
		String favoriteColor = "";
		double numberSiblings = 0;
//questions
		System.out.println("What is your first name?");
		System.out.println("What is your last name?");
		System.out.println("What is your age?");
		System.out.println("What is your birth month as a number (for example if you were born in March type 3?");
		System.out.println("What is your favorite ROYGBIV color?");
		System.out.println("How many siblings do you have?"); // trap for question what is a sibling
//function core
		
		Scanner input = new Scanner (System.in);
//first name
		
		System.out.println("What is your first name?");
		String firstName = input.nextLine();
		input.nextLine();
		
//last name
		
		System.out.println("What is your last name?");
		String lastName = input.nextLine();
		input.nextLine();
		
//age
		System.out.println("What is your age?");
		age = input.nextDouble();
		input.nextLine();
		
//birth month - add catch for typed age and convert to number
		System.out.println("What is your birth month as a number (for example if you were born in March type 3?");
		birthMonth = input.nextDouble();
		input.nextLine();
		
//Favorite color
		System.out.println("What is your favorite ROYGBIV color?");
		favoriteColor = input.nextLine();
		input.nextLine();
		
//siblings
		System.out.println("How many siblings do you have?");
		numberSiblings = input.nextDouble();
		
//final return *[First Name]* *[Last Name]* will retire in *[# of years]* with *[bank balance]* in the bank, a vacation home in *[location]*, and travel by *[mode of transporation]*.

		
		input.close();
	}

}
