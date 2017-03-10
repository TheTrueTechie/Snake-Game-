import javax.swing.JFrame;

public class Snake {
	public static void main(String[] args) {
		Data miniData = new Data();
		View miniView = new View();
		GameController miniController = new GameController(miniView, miniData);

		String snakeGame = "Snake Game";

		JFrame mainFrame = new JFrame();

		mainFrame.add(miniView);

		mainFrame.addKeyListener(miniController);

		mainFrame.setTitle(snakeGame);

		mainFrame.setVisible(true);
		mainFrame.setSize(1920, 1080);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
