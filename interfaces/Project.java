package interfaces;

public class Project {

	interface projectrunner {
		void exectute();

		default void execute1() {
			System.out.println("hello");
		};

	}

	class project1 implements projectrunner {

		@Override
		public void exectute() {
			// TODO Auto-generated method stub

		}

		class project2 implements projectrunner {

			@Override
			public void exectute() {
				// TODO Auto-generated method stub

			}

		}

	}

}
