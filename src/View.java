import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class View extends JPanel {

	SnakeModel snakeModel;
	SnakesFood food;

	View() {
	}

	public void paintComponent(Graphics g) {
		snakeModel.draw(g);
		food.foodGraphics(g);
	}

	public void setSnake(SnakeModel snakeModel) {
		this.snakeModel = snakeModel;
		food = snakeModel.food;
	}

}
