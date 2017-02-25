import java.awt.Color;
import java.awt.Graphics;

public class SnakeModel {
	int x;
	int y;

	SnakeModel(int x, int y) {
		this.x = x;
		this.y = y;

	}
	
	public void update() {
		
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.BLACK);
		g.drawRect(y, x, 10, 20);
	}
}
