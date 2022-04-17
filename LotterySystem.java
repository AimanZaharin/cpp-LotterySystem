/*Write a program that randomly generates a lottery of a two-digit number, prompts the
user to enter a two-digit number, and determines whether the user wins according to
the following rule:
o If the user input matches the lottery in exact order, the award is $10,000.
o If the user input match all the digits in the lottery, the award is $3,000.
o If one digit in the user input matches a digit in the lottery, the award is $1,000.
*/

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		
		// Generate a lottery
		 int lottery = (int)(Math.random() * 100);
		
		 // Prompt the user to enter a guess
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter your lottery pick number (input only two digits): ");
		 int guess = input.nextInt();
		 
		 // Get digits from lottery
		 int lotteryDigit1 = lottery / 10;
		 int lotteryDigit2 = lottery % 10;
		 
		 // Get digits from guess
		 int guessDigit1 = guess / 10;
		 int guessDigit2 = guess % 10;
		 System.out.println("The lottery number is " + lottery);
		 
		 // Check the guess
		 if (guess == lottery)
		 System.out.println("CONGRATULATIONS! Exact match: you win $10,000");
		 
		 else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
		 System.out.println("CONGRATULATIONS! Match all digits: you win $3,000");
		 
		 else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
		 System.out.println("CONGRATULATIONS! Match one digit: you win $1,000");
		 
		 else
		 System.out.println("Sorry, no match");

	}

}
