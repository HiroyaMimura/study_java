package practice;
import java.util.List;
import java.util.function.IntPredicate;

public class Main {
	public static void main(String[] args) {
		List<String> names = List.of("湊雄輔", "朝香あゆみ", "菅原拓真", "大江岳人");
		names.stream()
		.filter(n -> n.length() <= 4)
		.map(n -> n + "さん")
		.forEach(System.out::println);

		IntPredicate f1 = x -> x % 2 == 1;

		Func2 f2 = (point, name) -> {
			return name + "さんは" + ( point > 65 ? "合格" : "不合格");
		};
		System.out.println(f1.test(15));
		System.out.println(f2.call(66, "Smith"));
	}
}
