package practice;

import java.nio.file.Files;
import java.nio.file.Paths;

public class AnotherMain {
	public static void main(String[] args) throws Exception {
		Files.copy(Paths.get(args[0]), Paths.get(args[1]));
	}
}
