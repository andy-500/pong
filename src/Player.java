
public class Player {

	private int currentScore;
	private String name;
	
	
	public Player(String name){
		this.name = name;
		currentScore = 0;
	}
	
	public int getScore(){
		return currentScore;
	}
	
	public void scored(){
		currentScore++;
	}
}
