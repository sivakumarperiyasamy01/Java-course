package interfaces;

public class MarioGame implements Gamingconsole{

	@Override
	public void goup() {
		System.out.println("goup speed");
		
	}

	@Override
	public void godown() {
		System.out.println("goup down slow");
		
	}

	@Override
	public void moveLeft() {
		System.out.println("move left fast");
		
	}

	@Override
	public void moveRight() {
		System.out.println("move right slow");
		
	}
	

}
