import java.util.Random;

public class PeaceWarGame {
	
	private Player player1;
	private Player player2;
	private int numRounds;
	private int player1Score;
	private int player2Score;
	
	public PeaceWarGame(Player player1, Player player2, int numRounds) {
		this.player1 = player1;
		this.player2 = player2;
		this.numRounds = numRounds;
		this.player1Score = 0;
		this.player2Score = 0;
	}
	
	public void play() throws InterruptedException {
		for (int turn = 1; turn <= this.numRounds; turn++) {
			System.out.println("Year " + turn);
			System.out.println("Player 1 score: " + getPlayer1Score());
			System.out.println("Player 2 score: " + getPlayer2Score());
			
			// Have each player take their turn
			Move move1 = player1.takeTurn(turn, new Random());
			Move move2 = player2.takeTurn(turn, new Random());
			
			// Process the moves made for printing
			String move1Str = move1.toString();
			String move2Str = move1.toString();		
			
			// Record the respective opponent's moves
			player1.recordOpponentMove(0, move1);
			player2.recordOpponentMove(0, move2);
			
			System.out.println(player1.getDescription() + move1Str + ".");
			System.out.println(player2.getDescription() + move2Str + ".");
		
			if (move1Str.equals("peace") && move2Str.equals("peace")) {
				System.out.println("Peace for everyone!");
				this.player1Score += 3;
				this.player2Score += 3;
			} else if (move1Str.equals("war") && move2Str.equals("peace")) {
				System.out.println("Player 1 crushes player 2!");
				this.player1Score += 5;
				this.player2Score += 0;
			} else if (move1Str.equals("peace") && move2Str.equals("war")) {
				System.out.println("Player 2 crushes player 1!");
				this.player1Score += 0;
				this.player2Score += 5;
			} else if (move1Str.equals("war") && move2Str.equals("war")) {
				System.out.println("Everyone to arms!");
				this.player1Score += 1;
				this.player2Score += 1;
			} else {
				System.out.println("Invalid input.");
				System.exit(1);
			}
			Thread.sleep(1000);
			System.out.println(" ");
		}
		
		System.out.println("Final Scores");
		System.out.println("Player 1: " + getPlayer1Score());
		System.out.println("Player 2: " + getPlayer2Score());
		
		if (getPlayer1Score() > getPlayer2Score()) {
			System.out.println(">>> Player 1 wins! <<<");
		} else if (getPlayer1Score() < getPlayer2Score()) {
			System.out.println(">>> Player 2 wins! <<<");
		} else {
			System.out.println(">>> Everybody wins! <<<");
		}
		
	}
	
	public int getPlayer1Score() {
		return this.player1Score;
	}
	
	public int getPlayer2Score() {
		return this.player2Score;
	}

}
