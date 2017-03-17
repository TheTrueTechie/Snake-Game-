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
	void teleport(){
		if (x < 0){
			
			x = Snake.WIDTH;
		}
		if(x > Snake.WIDTH){
			x = 0;
		}
		if(y<0){
			y = Snake.HEIGHT;
		}
		if(y > Snake.HEIGHT){
			y = 0;
		}
	}

	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(x, y, 10, 10);
		g.drawRect(x, y, 10, 10);
	}
}
