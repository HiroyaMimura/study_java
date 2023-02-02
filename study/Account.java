package study;

public class Account {
	private String accountNo;
	private int zandaka;
	private AccountType accountType;

	public Account(String aNo, AccountType aType) {
		this.accountNo = aNo;
		this.accountType = aType;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public int getZandaka() {
		return zandaka;
	}

	public void setZandaka(int zandaka) {
		this.zandaka = zandaka;
	}

	public AccountType getAccounttype() {
		return accountType;
	}
}