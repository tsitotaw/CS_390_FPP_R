package mypackage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestWelcome {
	@Test
	public void testWelcome() {
		String result = Welcome2.welcome();
		assertEquals("Welcome", result);
	}
}
