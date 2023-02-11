package src.test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import src.main.java.Bank;

public class BankTest {
	@Test public void setName() {
		Bank b = new Bank();
		b.setName("ミヤビ");
	}

	@Test public void getNameWithNull() {
		try {
			Bank b = new Bank();
			b.setName(null);
		} catch(NullPointerException e) {
			return;
		}
		fail();
	}

	@Test
	public void throwsExceptionWithTwoName() {
		Bank b = new Bank();
		assertThrows(IllegalArgumentException.class, () -> { b.setName("ミヤ"); });
	}
}
