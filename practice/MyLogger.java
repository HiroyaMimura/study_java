package practice;

import java.io.FileWriter;
import java.io.IOException;

public class MyLogger {
	private static MyLogger theInstance;
	private FileWriter writer;
	private MyLogger() {
		try {
			this.writer = new FileWriter("c:¥¥dummylog.txt");
		} catch(IOException e) {

		}
	}
	public void log(String msg) throws IOException {
		this.writer.write(msg);
	}
	public static MyLogger getInstance() {
		if(theInstance == null) theInstance = new MyLogger();
		return theInstance;
	}
}
