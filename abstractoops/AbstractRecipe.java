package abstractoops;

public class AbstractRecipe extends Recipe {

	@Override
	void getReady() {
		System.out.println("get things Ready");
		
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
