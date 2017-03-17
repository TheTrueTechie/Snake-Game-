import javax.swing.JFrame;

public class Snake {
	public static final int WIDTH = 1920;
	public static final int HEIGHT = 980;
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
		mainFrame.setSize(WIDTH, HEIGHT);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
