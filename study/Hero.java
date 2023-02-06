package study;

import java.io.Serializable;

public class Hero implements Serializable {
	public static final long serialVersionUID = 81923983183921L;

	private String name;
	private int hp, mp;

	public Hero(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
}
