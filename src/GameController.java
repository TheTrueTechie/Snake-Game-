import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

public class GameController implements ActionListener, KeyListener {
	Timer t = new Timer(1000 / 60, this);

	View view;
	Data data;

	GameController(View view, Data data) {
		this.view = view;
		this.data = data;

		t.start();

		view.setSnake(data.returnSnakeModel());

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		view.repaint();
		data.update();

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			SnakeModel.upKey = true;
			SnakeModel.downKey = false;
			SnakeModel.leftKey = false;
			SnakeModel.rightKey = false;
		}

		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			SnakeModel.upKey = false;
			SnakeModel.downKey = true;
			SnakeModel.leftKey = false;
			SnakeModel.rightKey = false;
		}

		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			SnakeModel.upKey = false;
			SnakeModel.downKey = false;
			SnakeModel.leftKey = false;
			SnakeModel.rightKey = true;
		}

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			SnakeModel.upKey = false;
			SnakeModel.downKey = false;
			SnakeModel.leftKey = true;
			SnakeModel.rightKey = false;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
