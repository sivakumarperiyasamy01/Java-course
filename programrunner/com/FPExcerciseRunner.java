package programrunner.com;

import java.util.List;

public class FPExcerciseRunner {

	public static void main(String[] args) {

		List<Integer> Listofnumb = List.of(25, 89, 74, 12, 63);

		// calling reduce method
		Findsum(Listofnumb);

		// calling sum of number method;
		sumofOddnumbers(Listofnumb);

		// traditonal way of sum numbers

		int sumofnum = 0;

		for (int num : Listofnumb) {
			sumofnum = sumofnum + num;

		}

		System.out.println(sumofnum);

	}

	// use reduce method to find sum of numbers
	public static void Findsum(List<Integer> numb) {

		int sum = numb.stream().reduce(0, (total, numb2) -> {
			return total + numb2;

		});

		System.out.println(sum);

	}

	// to sum odd numbers only in this list

	public static void sumofOddnumbers(List<Integer> listofnum) {

		int sumofnum = listofnum.stream().filter((e) -> e % 2 == 1).reduce(0, (total, num2) -> {
			return total + num2;

		});

		System.out.println(sumofnum);

	}

}
