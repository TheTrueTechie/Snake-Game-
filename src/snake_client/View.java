package snake_client;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class View extends JPanel {

	SnakeModel snakeModel;
	SnakesFood food;

	View() {
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, 1920, 980);
		snakeModel.draw(g);

		food.foodGraphics(g);

		g.setColor(Color.BLACK);
		g.drawString(("Score: " + food.lengthOfSnake), 15, 15);

	}

	public void setSnake(SnakeModel snakeModel) {
		this.snakeModel = snakeModel;
		food = snakeModel.food;
	}

}
