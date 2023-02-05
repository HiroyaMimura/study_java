package study;

import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		FileReader fw = new FileReader("c:¥¥rpasave.dat");
		System.out.println("全てのデータを読んで表示します");
		int i = fw.read();
		while(i != -1) {
			char c = (char)i;
			System.out.print(c);
			i = fw.read();
		}
		System.out.println("ファイルの末尾に到達しました");
		fw.close();
		}
}