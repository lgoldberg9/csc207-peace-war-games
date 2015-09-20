import java.util.Random;
import java.util.Scanner;

public class HumanPlayer implements Player {

	private String name;
	
	public HumanPlayer(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getDescription() {
		return this.name + " chose ";
	}

	@Override
	public Move takeTurn(int num, Random rand) {
		
		Scanner playerPipe = new Scanner(System.in);
		
		Move playerMove;
		
		while (true) {
			System.out.print("Strategy? <peace|war> ");
			String move = playerPipe.nextLine();
			if (move.equals("peace")) {
				playerMove = Move.PEACE;
				break;
			} else if (move.equals("war")) {
				playerMove = Move.WAR;
				break;
			} else {
				continue;
			}
		}
		
		return playerMove;
	}

	@Override
	public void recordOpponentMove(int num, Move move) {
		System.out.println("4-20 Poopy butts blazing!");
		return;
	}
	
}
