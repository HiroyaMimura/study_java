package src.main.java;

public class Account {
	public String owner;
	public int zandaka;

	public Account(String owner, int zandaka) {
		this.owner = owner;
		this.zandaka = zandaka;
	}

	public void transfer(Account dest, int amount) {
		dest.zandaka += amount;
		zandaka -= amount;
	}
}