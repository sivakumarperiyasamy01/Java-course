package programrunner.com;

import java.util.List;
import java.util.TooManyListenersException;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ExcerciseRunner {

	public static void main(String[] args) {

		List<Integer> listnum = List.of(100, 35, 50, 60, 80);

		// collect the odd numbers as list

		List<Integer> oddlist = listnum.stream().filter(e -> e % 2 == 1).collect(Collectors.toList());

		System.out.println(oddlist);

		// collect the even numbers as list

		List<Integer> evenlist = listnum.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println(evenlist);

		// collect thre fist square numbers as list

		// we need to conver the intstream  to stream by using boxed method
		
		List<Integer> listnumb = IntStream.range(1, 11).map(e -> e * e).boxed().collect(Collectors.toList());

		System.out.println(listnumb);
	}

}
