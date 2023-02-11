package study;

import java.util.Comparator;

import src.main.java.Account;

public class ZandakaComparator implements Comparator<Account> {
	public int compare(Account x, Account y) {
		return (x.zandaka - y.zandaka);
	}
}
