import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class View extends JPanel {
	
	SnakeModel snakeModel;
	
	View() {
		repaint();
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		
		snakeModel.draw(g);
		
	
	}
	
	public void setSnake(SnakeModel snakeModel) {
	this.snakeModel = snakeModel; 

	}
	

}
