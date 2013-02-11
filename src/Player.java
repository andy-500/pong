
public class Player {

	private int currentScore;
	private String name;
    private int x, y;
	
	
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

    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
}
