import java.io.FileWriter;
import java.io.IOException;

public class MyMethodApp {

	public static void main(String[] args) throws IOException {
		// ..
		System.out.println(twoTimes("---", "A"));
		// ..
		FileWriter file1 = new FileWriter("result.txt");
		file1.write(twoTimes("***","B"));
		file1.close();
		// ..
		twoTimes("$$$", "C");

		System.out.println(onePlusOne());
	}

	public static int onePlusOne() {
		return 1 + 1;
	}

	public static String twoTimes(String delimiter, String text) {

		return delimiter + "\n" + text + "\n" + text;
	}

}
