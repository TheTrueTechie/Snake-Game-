import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class SnakesFood {
	public int lengthOfSnake = 1;
	int x = new Random().nextInt(1920);
	int y = new Random().nextInt(960);
	boolean z = false;
	SnakeModel snake;
	Rectangle collisionBox = new Rectangle(x, y, 10, 10);

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
		g.setColor(Color.WHITE);
		g.drawRect(snake.x, snake.y, 1, 1);
	}

	public boolean detectCollision() {

		collisionBox.setLocation(x, y);
		if (collisionBox.intersects(snake.head)) {

			z = true;
		} else {
			z = false;
		}
		return z;
	}

	public void collision() {
		if (z == true) {
			lengthOfSnake++;
			System.out.println("done");
			this.x = new Random().nextInt(1820);
			this.y = new Random().nextInt(900);
			snake.pastX.add(0, x);
			snake.pastY.add(0, y);
			// Snake body + 1
			snake.growSnake();
		}
	}
}
