package study;

/**
 * 口座クラス
 * このクラスは、1つの銀行口座を表します。
 */
public class Account {
	 String accountNo;
	 /** 残高 */
	 int zandaka;
	 AccountType accountType;

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

	public AccountType getAccountType() {
		return accountType;
	}
}