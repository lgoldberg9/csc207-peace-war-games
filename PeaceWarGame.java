import java.util.Random;
import java.util.Scanner;

public class PeaceWarGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if (args.length != 2) {
			System.out.println("Usage: PeaceWarGame <#/rounds> <ai|player>");
			return;
		}
		
		int rounds = Integer.parseInt(args[0]);
				
		if (args[1].equals("player")) {
			HumanPlayer player1 = new HumanPlayer("Player 1");
		} else if (args[1].equals("ai")) {
			RandomPlayer player1 = new RandomPlayer("Player 2");
		} else {
			System.out.println("Usage: PeaceWarGame <#/rounds> <ai|player>");
			return;
		}
		RandomPlayer player2 = new RandomPlayer("Player 2");
				
		System.out.println();
		
		
	}
	
	public PeaceWarGame(Player player1, Player player2, int numRounds) {
		
	}
	
	public void play() {
		
	}
	
	public int getPlayer1Score() {
		return 0;
	}
	
	public int getPlayer2Score() {
		return 0;
	}

}
