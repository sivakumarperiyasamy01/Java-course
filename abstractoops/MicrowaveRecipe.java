package abstractoops;

public class MicrowaveRecipe extends Recipe {

	@Override
	void getReady() {
		System.out.println("get things Ready");
		System.out.println("switch on microwave");
		
	}

	@Override
	void prepare() {
		System.out.println("prepare for cooking");
		
	}

	@Override
	void cleanup() {
		System.out.println("clean all vessals ");
		
	}

}
