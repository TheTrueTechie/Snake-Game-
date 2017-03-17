import java.awt.Color;
import java.awt.Graphics;
import java.util.Stack;

public class SnakeModel {
	int x;
	int y;

	int delay = 0;

	Stack<Integer> pastX = new Stack<Integer>();
	Stack<Integer> pastY = new Stack<Integer>();

	public static boolean upKey = false;
	public static boolean downKey = false;
	public static boolean rightKey = true;
	public static boolean leftKey = false;

	SnakeModel(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public void update() {
		if (upKey == true) {
			y = y - 3;
		}

		if (downKey == true) {
			y = y + 3;
		}

		if (rightKey == true) {
			x = x + 3;
		}

		if (leftKey == true) {
			x = x - 3;
		}
		teleport();
	}

	void teleport() {
		if (x < 0) {

			x = Snake.WIDTH;
		}
		if (x > Snake.WIDTH) {
			x = 0;
		}
		if (y < 0) {
			y = Snake.HEIGHT;
		}
		if (y > Snake.HEIGHT) {
			y = 0;
		}
	}

	public void draw(Graphics g) {
		pastX.add(0, x);
		pastY.add(0, y);
		delay++;
		if (delay > 5) {
			g.fillRect(pastX.pop(), pastY.pop(), 10, 10);

		}

		g.setColor(Color.BLACK);
		g.fillRect(x, y, 10, 10);
		g.drawRect(x, y, 10, 10);
	}
}
