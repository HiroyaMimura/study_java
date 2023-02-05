package study;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Main {
	public static void main(String[] args) throws IOException {
		String msg = "第一土曜日は資源ゴミの回収です";
		Reader sr = new StringReader(msg);
		System.out.print((char)sr.read());
		System.out.print((char)sr.read());
		}
}