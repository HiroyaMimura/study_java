package study;

public class Hero {
	String name;
	int hp;

	public Hero() {
		this.name = "";
	}

	public Hero(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}


}
