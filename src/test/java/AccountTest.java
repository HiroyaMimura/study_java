package src.test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.main.java.Account;

public class AccountTest {
	@Test
	public void testDeniesNegativeZandakaSet() {
		Account a = new Account();
		assertThrows(IllegalArgumentException.class, () -> a.setZandaka(-100));
	}
}
