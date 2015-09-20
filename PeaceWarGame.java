import java.util.Random;
import java.util.Scanner;

public class PeaceWarGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		int rounds = Integer.parseInt(args[0]);
		
		Random random = new Random();
		System.out.println(random.nextInt(2));
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
