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

	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_UP) {

		}

		if (e.getKeyCode() == KeyEvent.VK_DOWN) {

		}

		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

		}

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
