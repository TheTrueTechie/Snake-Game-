import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class GameController implements ActionListener {
	Timer t = new Timer(1000/60, this);
	
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

}
