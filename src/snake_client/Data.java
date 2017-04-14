package snake_client;

import java.util.ArrayList;

public class Data {
	public ArrayList<SnakeModel> snakeObj = new ArrayList<>();

	Data() {
		snakeObj.add(new SnakeModel(50, 50)); 
	}

	public ArrayList<SnakeModel> returnSnakeModel() {

		return snakeObj;
	}

	public void update() {
		for(SnakeModel a : snakeObj)
		 a.update();
	}
}
