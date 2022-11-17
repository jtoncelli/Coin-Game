import java.util.*;
class Main {
  public static int userTurn(int coins){
		//a helper method which prompts the user for a turn and defaults to 2 coins if invalid input is entered
		Scanner scan = new Scanner(System.in);
		System.out.println("Coins left: " + coins + ", remove 1 or 2 coins?: ");
		String input = scan.nextLine();
		try{
			int a = Integer.parseInt(input);
		}catch(Exception e){
			System.out.println("Invalid input. You will move 2");
			input = "2";
		}
		return Integer.parseInt(input);
}
public static void winGame(int coins){
	//is called when a winning condition is ensured
	//a winning condition is when it is the user's turn and (coins - 4) % 3 == 0 is true
	//from then on, the computer will do the opposite of the user until it wins
	while (coins > 0){
			int userMove = userTurn(coins);
			coins -= 3;
			if(coins > 0){
				if(userMove == 1) System.out.println("Computer removes 2.");
				else System.out.println("Computer removes 1.");
			}
			else System.out.println("The computer wins.");
		}
}
 public static void main(String[] args) {
   int coins = 23;
   Scanner myScan = new Scanner(System.in);
   System.out.println("\nThe goal is to not pick up the last coin. There are 23 coins initially. \nEnter 1 for user start, enter 2 for computer start: ");
   String startTurn = myScan.nextLine();
	startTurn = startTurn.trim();
	if(startTurn.equals("2")){
		System.out.println("Computer removes 1.");
		coins -= 1;
		//removing one coin from 23 ensures a winning condition, and the game is essentially over
		winGame(coins);
	}
	else if(startTurn.equals("1")){
		while(coins > 0){
			int userMove = userTurn(coins);
			coins -= userMove;
			if(coins <= 0) System.out.println("The computer wins.");
			else if(coins == 1){
				coins -= 1;
				//the ONLY condition in which the user wins; the computer is left with 1 coin
				System.out.println("You win.");
			}
			else if((coins - 5) % 3 == 0 || coins == 2){
				//the computer will remove two if it satisfies the winning conditions
				coins -= 1;
				System.out.println("Computer removes 1.");
				winGame(coins);
				break;
			}
		  else if((coins - 6) % 3 == 0 || coins == 3){
				//the computer will remove two if it satisfies the winning conditions
				coins -=2;
				System.out.println("Computer removes 2");
				winGame(coins);
				break;
			}
			else{
				coins -= 2;
				System.out.println("Computer removes 2.");
			}
		}
	}
	else{
		System.out.println("Hope you play next time!");
	}
 }
}
