import java.util.ArrayList;
import java.util.Random;

public class RandomPlayer implements Player {

	private String name;
	private ArrayList<Move> moveList = new ArrayList<Move>();
	
	public RandomPlayer(String name) {
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
		
		Move move;
		int randomMove = rand.nextInt(2);
		
		if (randomMove == 0) {
			move = Move.PEACE;
		} else {
			move = Move.WAR;
		} 
		return move;
	}

	@Override
	public void recordOpponentMove(int num, Move move) {
		moveList.add(move);
	}
	
	
	
}
