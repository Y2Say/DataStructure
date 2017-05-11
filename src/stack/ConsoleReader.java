package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ConsoleReader {
	private BufferedReader reader;

	public ConsoleReader(InputStream inStream) {
		reader = new BufferedReader(new InputStreamReader(inStream));
	}

	public int readInt() {
		String inputString = readLine();
		return Integer.parseInt(inputString);
	}

	public double readDouble() {
		String inputString = readLine();

		return Double.parseDouble(inputString);
	}

	public String readLine() {
		String inputLine = "";

		try {
			inputLine = reader.readLine();
		} catch (IOException e) {
			System.out.println(e);
			System.exit(1);
		}

		return inputLine;
	}

	public static void main(String s[]) {

		int i;
		System.out.println("Please input a integer :");
		ConsoleReader reader = new ConsoleReader(System.in);
		i = reader.readInt();

		System.out.println(i);
	}

}