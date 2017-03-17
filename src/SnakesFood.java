import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class SnakesFood {
	int x = new Random().nextInt(1920);
	int y = new Random().nextInt(960);
	SnakeModel snake;

	SnakesFood() {

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

	public void collision() {
		if (snake.x == this.x && snake.y == this.y) {
			this.x = new Random().nextInt(1920);
			this.y = new Random().nextInt(960); 
			//Snake body + 1
		}
	}
}
