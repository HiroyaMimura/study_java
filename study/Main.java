package study;

import java.util.Iterator;
import java.util.Properties;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("利用中のjavaバージョン");
		System.out.println(System.getProperty("java.version"));

		Properties p = System.getProperties();
		Iterator<String> i = p.stringPropertyNames().iterator();
		System.out.println("システムプロパティ一覧");
		while(i.hasNext()) {
			String key = i.next();
			System.out.print(key + " = ");
			System.out.println(System.getProperty(key));
		}
	}
}