package Lab3;

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		char answer ;
		String movieName;
		String rate;
		int tickets;
		
		Movie movie = new Movie();   
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Enter the name of a movie");
			movieName = input.nextLine();
			movie.setTitle(movieName);
			input.nextLine();
			System.out.println("Enter the rating of the movie");
			rate = input.nextLine();
			movie.setRating(rate);
			
			System.out.println("Enter the number of the tickets sold for this movie");
			tickets = input.nextInt();
			movie.setSoldTickets(tickets);
			input.nextLine();
			System.out.println(movie.toString());
			
			
			System.out.println("Do you want to enter another?(y or n)");
			answer  = input.next().charAt(0);
		}while(answer == 'y' || answer == 'Y');
		
		
		System.out.println("Goodbye");
	}

}
