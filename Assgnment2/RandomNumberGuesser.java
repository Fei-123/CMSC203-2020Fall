package Assignment2;

import java.util.Scanner;

public class RandomNumberGuesser {

	public static void main(String[] args) {
		
		String answer ="";
		int nextGuess;
		
		
		System.out.println("======Random Number Guesser=====");
		//get a random number
		RNG rng = new RNG();
		
		
		do{
			int randomNum = RNG.rand();
			int highGuess=100;
			int lowGuess=0;
			int count = 0;
			//ask user to enter a guesss
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your first guess");
			nextGuess = input.nextInt();
			while (nextGuess !=randomNum) {
		
			
			System.out.println("Number of guesses is " + ++count);
			
			
			if(nextGuess > randomNum) {
				System.out.println("Your guess is too high");
				highGuess = nextGuess;
				System.out.println("Enter your next guess between " + lowGuess +" and " +highGuess);
				nextGuess = input.nextInt();
				
			}
			else if(nextGuess < randomNum) {
				System.out.println("Your guess is too low");
				lowGuess = nextGuess;
				System.out.println("Enter your next guess between " + lowGuess +" and " +highGuess);
				nextGuess = input.nextInt();
				
			}
			
			while (nextGuess<lowGuess||nextGuess>highGuess) {
				RNG.inputValidation( nextGuess,  lowGuess,  highGuess);
				nextGuess = input.nextInt();
			}
			
			if(nextGuess == randomNum){
				System.out.println("Congratulation, you guessed correctly");
				System.out.println("Try again? (yes or no)");
				Scanner scanner = new Scanner(System.in);
				answer = scanner.nextLine();
			}
			
			}
		}while(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")); 
				
	
	}
}
