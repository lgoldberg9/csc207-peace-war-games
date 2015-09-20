import java.util.Random;


public class RandomPlayer implements Player {

	private String name;
	private Move currentMove;
	
	public RandomPlayer(String name) {
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
		
		return null;
	}

	@Override
	public void recordOpponentMove(int num, Move move) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
