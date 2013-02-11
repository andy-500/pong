import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * The field for the game and shit.
 *
 */
public class Game extends JFrame {
	
	/**How fast the puck and shit moves.*/
	private int level;
	private Graphics2D draw;
	/**Where shit in the window goes.*/
	private Container pane;
	
	
	public Game(String player1, String player2){
		super("Pong");
		initComps(player1, player2);
		
	}
	
	public void initComps(String player1, String player2){
		
		pane = getContentPane();
		setSize(600,400);
		Container names = new Container();
		
		pane.setLayout(new BorderLayout());
		names.setLayout(new GridLayout(1,3));
		
		names.add(new JLabel(player1));
		names.add(new JLabel(""));
		names.add(new JLabel(player2));
		
		pane.add(names, BorderLayout.NORTH);
		
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.fillRect(30, 80, 500, 300);
		
	}
	
	public int getLevel(){
		return level;
	}

}
