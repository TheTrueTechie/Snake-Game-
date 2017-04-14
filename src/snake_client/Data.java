package snake_client;

public class Data {
	SnakeModel snakeModel;
 Data() {
	 snakeModel = new SnakeModel(50,50);
	
	 
 }
 public SnakeModel returnSnakeModel() {
	 
	 
	 return snakeModel; 
 }
public void update() {
snakeModel.update();
	
}
}
