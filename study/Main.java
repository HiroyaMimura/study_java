package study;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Main {
	public static void main(String[] args) throws Exception {
		Locale loc = Locale.getDefault();
		System.out.println(loc.getCountry() + "-" + loc.getLanguage());
		String now = (new SimpleDateFormat()).format(new Date());
		if(loc.getLanguage().equals("ja")) {
			System.out.println("現在の時刻は" + now);
		} else {
			System.out.println("Current time is" + now);
		}
	}
}