package exception.Practice;

public class RunException {

	public static void main(String[] args) {

		PassportException p1 = new PassportException(null);

		try {
			p1.getlocation("asia");

		} catch (PassportException re) {

			System.out.println(re.getMessage());

		}

		try {
			p1.checkage(15);
		} catch (PassportException re) {
			System.out.println(re.getMessage());
		}

	}

}
