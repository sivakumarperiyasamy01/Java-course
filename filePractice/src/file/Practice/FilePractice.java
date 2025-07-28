package file.Practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FilePractice {

	public static void main(String[] args) throws IOException {

		FilePractice f1 = new FilePractice();

		// f1.fileCreate();
		// f1.folderCreate();
		// f1.fileWrite();
		// f1.filewriteNumbers();
		// f1.fileWriteString();
		// f1.fileread();
		// f1.bufferreader();
		// f1.deleteFile();
		// f1.deleteexistfile();
		 f1.filewordReader();
		
		  

	}

	private void filewordReader() throws IOException   {
		
		File f1= new File("C:\\Users\\P SIVAKUMAR\\Music\\file.txt");
		
		FileReader fr= new FileReader(f1);
		
		BufferedReader br= new BufferedReader(fr);
		
		String st;
		
		while((st= br.readLine()) != null) {
			
		String[]words=st.split(" ");
		System.out.println(Arrays.toString(words));
		
		int len=words.length;
		System.out.println(len);
			
		}
		
		
	}

	private void deleteexistfile() {
		File s2 = new File("C:\\Users\\P SIVAKUMAR\\Music\\file1");

		
		// check the  if the file exist then delete
		if (s2.exists()) {
			if (s2.delete()) {

				System.out.println("delete");

			} else {
				System.out.println("file not deleted");
			}
		}else {
			System.out.println("file not found");
		}

	}

	private void deleteFile() {
		File s1 = new File("C:\\Users\\P SIVAKUMAR\\Music\\siva");

		if (s1.delete()) {
			System.out.println("file deleted");
		} else {
			System.out.println("file not found");
		}

	}

	private void bufferreader() throws IOException {

		File f1 = new File("C:\\Users\\P SIVAKUMAR\\Music\\siva");

		FileReader f2 = new FileReader(f1);

		BufferedReader f3 = new BufferedReader(f2);

		String result = f3.readLine();

		while (result != null) {

			System.out.println(result);
			result = f3.readLine();
		}

	}

	private void fileread() throws IOException {

		File f1 = new File("C:\\Users\\P SIVAKUMAR\\Music\\siva");

		FileReader fr = new FileReader(f1);

		int result = fr.read(); // it returns ascii value of char for small t it gives 116

		System.out.println((char) result); // type cast integer to char

	}

	private void fileWriteString() throws IOException {

		// it creates new file and write

		String[] words = { "this is java program", "i am a good programmer", "i love coding" };

		FileWriter r1 = new FileWriter("C:\\Users\\P SIVAKUMAR\\Music\\siva");

		// if file already exist it uses the file to write if not create the new what we
		// given and write

		for (int i = 0; i < words.length; i++) {

			r1.write(words[i]);
			r1.write("\n");

		}

		r1.close();

	}

	private void filewriteNumbers() throws IOException {

		FileWriter f1 = new FileWriter("C:\\Users\\P SIVAKUMAR\\Music\\fileio");// it creates new file and write

		for (int i = 1; i <= 10; i++) {

			// f1.write(i + "\n");
			f1.write(String.valueOf(i + "\n"));

		}

		f1.close();

	}

	private void fileWrite() throws IOException {

		FileWriter f1 = new FileWriter("C:\\Users\\P SIVAKUMAR\\Music\\file.txt");

		f1.write("i love programming \n");

		f1.write("i love  java programming \n");

		f1.close(); // it is mandatory to close

	}

	private void folderCreate() {

		File f2 = new File("C:\\Users\\P SIVAKUMAR\\Music\\learningfileio");

		boolean result1 = f2.mkdir();

		System.out.println(result1);

	}

	private void fileCreate() throws IOException {

		File f1 = new File("C:\\Users\\P SIVAKUMAR\\Music\\file1.txt");

		boolean result = f1.createNewFile();
		System.out.println(result);

	}

}
