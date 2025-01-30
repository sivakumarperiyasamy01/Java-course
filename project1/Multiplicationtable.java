package project1;

// create generic mathamatic table

public class Multiplicationtable {

	void print() {
		print();
	}

	// passing arguments

	void print(int tabel) {
		
		print(tabel,1,20);
	}

	// passing arguments and values

	void print(int tabel, int from, int to) {
		for (int i = from; i <= to; i++) {

			System.out.printf("%d*%d=%d", tabel, i, tabel * i).println();

		}
	}

}