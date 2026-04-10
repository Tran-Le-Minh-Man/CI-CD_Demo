import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculator {

	@Test
	void test() {
		
		Calculator c = new Calculator();
		assertEquals(15, c.plus(10, 5));
	}

}
