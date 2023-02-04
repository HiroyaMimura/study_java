package study;

import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Bank {
	String name;
	String address;

	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
}
