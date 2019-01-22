import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {
		/*
		 * 1. Prompt 2 user names
		 * 2. First round:
		 * 		- who won or tie?
		 * 3. Second round:
		 * 		- who won or tie?
		 * 		- if same player wins, announce winner
		 * 		- if the other player wins, continue to next round
		 * 4. Third round
		 * 		- check who won and announce winner
		 */

		Scanner input = new Scanner(System.in);
		
		// -----------------------------------
		// Prompt for names of players
		// -----------------------------------
		System.out.println("Enter the name of player 1:");
		String player1 = input.nextLine();
		System.out.println("Enter the name of player 2:");
		String player2 = input.nextLine();
		
		// -----------------------------------
		// Round 1
		// -----------------------------------
		System.out.println("========");
		System.out.println("Round 1:");
		System.out.println("========");
		
		int counter1 = 0;
		int counter2 = 0;
		int counterTie = 0;
		
		System.out.println("What does " + player1 + " play? (R, P, or S)");
		String player1Result = input.nextLine();
		System.out.println("What does " + player2 + " play? (R, P, or S)");
		String player2Result = input.nextLine();
		
		if(player1Result.equals("R") && player2Result.equals("R")) {
			counterTie++;
		}
		else if(player1Result.equals("P") && player2Result.equals("P")) {
			counterTie++;
		}
		else if(player1Result.equals("S") && player2Result.equals("S")) {
			counterTie++;
		}
		else if(player1Result.equals("R") && player2Result.equals("P")) {
			counter2++;
		}
		else if(player1Result.equals("R") && player2Result.equals("S")) {
			counter1++;
		}
		else if(player1Result.equals("P") && player2Result.equals("R")) {
			counter1++;
		}
		else if(player1Result.equals("P") && player2Result.equals("S")) {
			counter2++;
		}
		else if(player1Result.equals("S") && player2Result.equals("R")) {
			counter2++;
		}
		else if(player1Result.equals("S") && player2Result.equals("P")) {
			counter1++;
		}
		
		// -----------------------------------
		// Round 2
		// -----------------------------------
		System.out.println("========");
		System.out.println("Round 2:");
		System.out.println("========");
	
		System.out.println("What does " + player1 + " play? (R, P, or S)");
		player1Result = input.nextLine();
		System.out.println("What does " + player2 + " play? (R, P, or S)");
		player2Result = input.nextLine();
				
		if(player1Result.equals("R") && player2Result.equals("R")) {
			counterTie++;
		}
		else if(player1Result.equals("P") && player2Result.equals("P")) {
			counterTie++;
		}
		else if(player1Result.equals("S") && player2Result.equals("S")) {
			counterTie++;
		}
		else if(player1Result.equals("R") && player2Result.equals("P")) {
			counter2++;
		}
		else if(player1Result.equals("R") && player2Result.equals("S")) {
			counter1++;
		}
		else if(player1Result.equals("P") && player2Result.equals("R")) {
			counter1++;
		}
		else if(player1Result.equals("P") && player2Result.equals("S")) {
			counter2++;
		}
		else if(player1Result.equals("S") && player2Result.equals("R")) {
			counter2++;
		}
		else if(player1Result.equals("S") && player2Result.equals("P")) {
			counter1++;
		}
		
		if(counter1 == counter2 || counterTie > 0) {
			// -----------------------------------
			// Round 3
			// -----------------------------------
			System.out.println("========");
			System.out.println("Round 3:");
			System.out.println("========");
		
			System.out.println("What does " + player1 + " play? (R, P, or S)");
			player1Result = input.nextLine();
			System.out.println("What does " + player2 + " play? (R, P, or S)");
			player2Result = input.nextLine();
					
			if(player1Result.equals("R") && player2Result.equals("R")) {
			}
			else if(player1Result.equals("P") && player2Result.equals("P")) {
			}
			else if(player1Result.equals("S") && player2Result.equals("S")) {
			}
			else if(player1Result.equals("R") && player2Result.equals("P")) {
				counter2++;
			}
			else if(player1Result.equals("R") && player2Result.equals("S")) {
				counter1++;
			}
			else if(player1Result.equals("P") && player2Result.equals("R")) {
				counter1++;
			}
			else if(player1Result.equals("P") && player2Result.equals("S")) {
				counter2++;
			}
			else if(player1Result.equals("S") && player2Result.equals("R")) {
				counter2++;
			}
			else if(player1Result.equals("S") && player2Result.equals("P")) {
				counter1++;
			}
			
			if(counter1 > counter2) {
				System.out.println("Game over: " + player1 + " wins!");
			}
			else if(counter1 < counter2){
				System.out.println("Game over: " + player2 + " wins!");
			}
			else {
				System.out.println("Game over: a tie between " + player1 + " and " + player2);
			}
		}
		else {
			if(counter1 > counter2) {
				System.out.println("Game over: " + player1 + " wins!");
			}
			else {
				System.out.println("Game over: " + player2 + " wins!");
			}
		}
		
		// Testing game result
//		if(counter1 > counter2) {
//			System.out.println("Player 1 wins.");
//		}
//		else if(counter1 < counter2) {
//			System.out.println("Player 2 wins.");
//		}
//		else {
//			System.out.println("It's a tie!");
//		}
		
		
		input.close();
	}

}
