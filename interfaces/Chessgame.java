package interfaces;

public class Chessgame implements Gamingconsole {

	@Override
	public void goup() {
		System.out.println("move forward");
		
	}

	@Override
	public void godown() {
		System.out.println("move back");
		
	}

	@Override
	public void moveLeft() {
		System.out.println("move left fast");
		
	}

	@Override
	public void moveRight() {
		System.out.println("move right fasterway ");
		
	}
	

}
