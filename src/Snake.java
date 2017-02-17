
public class Snake {
	public static void main(String[] args) {
		Model miniModel = new Model();
		View miniView = new View();
		GameController miniController = new GameController(miniView, miniModel);

	}
}
