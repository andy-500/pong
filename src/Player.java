public class Player {

	private int currentScore;
	private String name;
    	private int x, y;
	
	
	public Player(String playername, int xvalue, int yvalue){
		name = playername;
		currentScore = 0;
		x = xvalue;
		y = yvalue;
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
    
    	public void moveUp(int boardHeight){
    		y = y + boardHeight/10;
    	}
    
    	public void moveDown(int boardHeight){
    		y = y - boardHeight/10;
    	}
}
