package study;

import java.util.Objects;

public class Hero {
	String name;
	int hp;

	public int hadhCode() {
		return Objects.hash(this.name, this.hp);
	}
}
