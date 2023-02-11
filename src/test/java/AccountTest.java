package src.test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.main.java.Account;

public class AccountTest {
	@Test public void testInstantiate() {
		Account a = new Account("ミナト", 30000);
		assertEquals("ミナト", a.owner);
		assertEquals(30000, a.zandaka);
	}
	@Test public void transfer() {

	}
}
