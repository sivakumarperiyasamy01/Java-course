package oopsabstact;

public abstract class Abstactrecipe {
	
	public void execute() {
		getready();
		dothedish();
		cleanup();
		
	}
	
	
	abstract void getready();
	abstract void dothedish();
	abstract void cleanup();
}
