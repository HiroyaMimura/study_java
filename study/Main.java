package study;

import java.io.FileReader;
import java.util.Properties;

public class Main {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("c:¥¥rgpdata.prorerties");
		Properties p = new Properties();
		p.load(fr);
		String name = p.getProperty("heroName");
		String strHp = p.getProperty("heroHp");
		int hp = Integer.parseInt(strHp);
		System.out.println("勇者の名前：" + name);
		System.out.println("勇者のHP：" + hp);
		fr.close();
	}
}