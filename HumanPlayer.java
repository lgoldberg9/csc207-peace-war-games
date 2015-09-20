import java.util.Random;
import java.util.Scanner;

public class HumanPlayer implements Player {

	private String name;
	private Move currentMove;
	
	public HumanPlayer(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getDescription() {
		return this.name + "chose " + Move.toString(this.currentMove);
	}

	@Override
	public Move takeTurn(int num, Random rand) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("Strategy? <peace|war>");
			String move = in.nextLine();
			if (move.equals("peace")) {
				in.close();
				return Move.PEACE;
			} else if (move.equals("war")) {
				in.close();
				return Move.WAR;
			} else {
				continue;
			}
		}
	}

	@Override
	public void recordOpponentMove(int num, Move move) {

	}
	
}
