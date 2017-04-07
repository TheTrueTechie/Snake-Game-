import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class SnakesFood {
	int x = new Random().nextInt(1920);
	int y = new Random().nextInt(960);
	boolean z = false;
	SnakeModel snake;

	SnakesFood(SnakeModel snakeModel) {
		this.snake = snakeModel;
	}

	public void foodSpawn(int x1, int y1) {
		x1 = x;
		y1 = y;

	}

	public void foodGraphics(Graphics g) {
		g.setColor(Color.GRAY);
		g.fillRect(x, y, 10, 10);
		g.drawRect(x, y, 10, 10);
	}

	public boolean detectCollision() {
		if (((snake.x >= this.x && snake.x <= this.x + 10) || (snake.x <= this.x && snake.x >= this.x - 10))
				&& (snake.y >= this.y && snake.y <= this.y + 10)) {
			z = true;
		} else {
			z = false;
		}
		return z;
	}

	public void collision() {
		if (z == true) {
			System.out.println("done");
			this.x = new Random().nextInt(1820);
			this.y = new Random().nextInt(960);
			snake.pastX.add(0, x);
			snake.pastY.add(0, y);
			// Snake body + 1
			snake.growSnake();
		}
	}
}
