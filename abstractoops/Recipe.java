package abstractoops;

public abstract class Recipe {

	void execute() {
		getReady();
		prepare();
		cleanup();
		
 
	}

	abstract void getReady();

	abstract void prepare();

	abstract void cleanup();

}
