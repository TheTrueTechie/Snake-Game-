import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Stack;

public class SnakeModel {
	int x;
	int y;
	int delay = 0;
	boolean hit = false;
	int prevXY = 0;
	int bufferLength = 10;
	ArrayList<Integer> xyIndex = new ArrayList<Integer>();
	ArrayList <Rectangle> rectangle = new ArrayList<>();
	Rectangle body = new Rectangle(x, y, 10, 10);
	SnakesFood food = new SnakesFood(this);
	Stack<Integer> pastX = new Stack<Integer>();
	Stack<Integer> pastY = new Stack<Integer>();

	public static boolean upKey = false;
	public static boolean downKey = false;
	public static boolean rightKey = true;
	public static boolean leftKey = false;

	SnakeModel(int x, int y) {
		xyIndex.add(0);
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
		food.detectCollision();
		food.collision();
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
	
	
	public void detectCollision () {
		for (Rectangle r: rectangle) {
			if(r != rectangle.get(0)){
			rectangle.get(0).intersects(r);
			}
			//r.setLocation(prevXY, delay);	
		}
	}

	public void draw(Graphics g) {
		pastX.add(0, x);
		pastY.add(0, y);
		delay++;
		if (delay > bufferLength) {
			for (int xy : xyIndex) {

				g.fillRect(pastX.get(xy), pastY.get(xy), 10, 10);
			}
			pastX.pop();
			pastY.pop();

		}

		g.setColor(Color.BLACK);
		g.fillRect(x, y, 10, 10);
		g.drawRect(x, y, 10, 10);

	}

	public void growSnake() {
		prevXY += 5;
		xyIndex.add(prevXY);

		prevXY = xyIndex.get(xyIndex.size() - 1);

		bufferLength += 5;
	}

}
