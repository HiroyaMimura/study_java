package study;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Bank {
	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(Main.class);
		if(args.length != 2) {
			logger.error("起動引数の数が異常：" + args.length);
		}
	}
}
