package testchar;

import org.apache.commons.lang.builder.HashCodeBuilder;

public class TestChar {
	public static void main(String[] args) {
		int i = 'A';
		System.err.println(i);
		System.err.println(new HashCodeBuilder().append("ss").toHashCode());
		System.err.println("ss".hashCode());
	}
}
