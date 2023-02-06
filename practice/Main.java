package practice;

import java.io.OutputStream;
import java.net.Socket;

public class Main {
	public static void main(String[] args) throws Exception {
		Socket sock = new Socket("smtp.example.com", 60025);
		OutputStream os = sock.getOutputStream();
		os.write("HELLO example.com¥r¥n".getBytes());
		os.flush();
		sock.close();
	}
}
