
public class Main {
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		if (args.length != 2) {
			System.out.println("Usage: PeaceWarGame <#/rounds> <ai|player>");
			return;
		}
		
		int rounds = Integer.parseInt(args[0]);
		Player player1;
		Player player2;
				
		if (args[1].equals("player")) {
			player1 = new HumanPlayer("Player 1");
		} else if (args[1].equals("ai")) {
			player1 = new RandomPlayer("Player 1");
		} else {
			System.out.println("Usage: PeaceWarGame <#/rounds> <ai|player>");
			return;
		}
		player2 = new RandomPlayer("Player 2");
				
		PeaceWarGame game = new PeaceWarGame(player1, player2, rounds);
		
		game.play();
		
		
	}
}
