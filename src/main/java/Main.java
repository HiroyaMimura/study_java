package src.main.java;

public class Main {
	public static void main(String[] args) throws Exception {
		int age = 33;
		assert(++age >= 20);
		System.out.println("あなたの来年の年齢は" + age);
	 }
}
