import java.awt.Color;
import java.awt.Graphics;

public class SnakeModel {
	int x;
	int y;

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
			y = y + 1;
		}

		if (downKey == true) {
			y = y - 1;
		}

		if (rightKey == true) {
			x = x + 1;
		}

		if (leftKey == true) {
			x = x - 1;
		}

	}

	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(y, x, 10, 20);
	}
}
