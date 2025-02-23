package forloop;

public class Sumnumber {

	private int num;

	Sumnumber(int value) {
		this.num = value;

	}

	public int sumupto() {

		int sumnum=0;

		// GUARD CHECK
		if (num < 0) {
			return 0;
		}

		for (int i = 0; i <= num; i++) {

			// sumnum=sumnum+i;

			sumnum += i;

		}

		return sumnum;

	}

}
