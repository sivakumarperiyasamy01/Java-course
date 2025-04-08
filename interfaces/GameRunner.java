package interfaces;

public class GameRunner {

	public static void main(String[] args) {
		Gamingconsole game= new MarioGame();
		game.goup();
		game.godown();
		game.moveRight();
		game.moveLeft();

	}

}
