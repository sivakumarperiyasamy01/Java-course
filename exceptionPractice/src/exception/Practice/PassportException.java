package exception.Practice;

public class PassportException extends Exception {

	public PassportException(String msg) {

		super(msg);
	}

	public void getlocation(String name) throws PassportException {

		if ("india".equalsIgnoreCase(name)) {

			System.out.println("location found");

		} else {

			throw new PassportException("siva");

		}

	}

	public void checkage(int i) throws PassportException {

		if (i > 18) {
			System.out.println("you are eligible for vote");
		} else {
			
			throw new PassportException("you are not eligible for vote");
		}

	}

}
