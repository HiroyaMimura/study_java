package study;

public class Main {
	public static void main(String[] args) {
		boolean isErr = true;
		if(isErr) {
			System.out.println("データが壊れています。以上終了します");
			System.exit(1);
		}
		System.out.println("正常終了しました");
	}
}