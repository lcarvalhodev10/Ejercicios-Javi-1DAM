package unit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CounterTest {
	
	private Counter count; 
	
	@BeforeEach
	void setUp() {
		count = new Counter(); 
	}
	
	@Test
	@DisplayName("Empieza a 0")
	void testStartsAtZero() {
		assertEquals(0, count.getValue());
	}
	
	@Test
	@DisplayName("Incrementar aumenta el valor en 1")
	void testIncrement() {
		count.increment(); 
		assertEquals(1, count.getValue());
	}
	
	@Test
	@DisplayName("Decrementar reduce el valor en 1")
	void testDecrement() {
		count.decrement(); 
		assertEquals(-1, count.getValue());
	}
	
	@Test
	@DisplayName("Al incrementar 3 veces el valor es 3")
	void testIncrementThreeTimes() {
		count.increment(); 
		count.increment(); 
		count.increment(); 
		
		assertEquals(3, count.getValue());
	}
	
	@Test
	@DisplayName("Al decrementar 2 veces el valor es -2")
	void testDecrementTwoTimes() {
		count.decrement();
		count.decrement(); 
		
		assertEquals(-2, count.getValue());
	}
	
	@Test
	@DisplayName("Resetar cuando contador al maximo es true")
	void testResetReturnsToZero() {
		for (int i = 0; i < count.getMaxValue(); i++) {
			count.increment(); 
		}
		count.reset(); 
		//assertTrue(true);
		assertEquals(0, count.getValue());
	}
	
	@Test
	@DisplayName("Incrementar si ya esta en valor maximo es false")
	void testIncrementReturnsFalseWhenFull() {
		for (int i = 0; i < count.getMaxValue(); i++) {
			count.increment(); 
		}
		assertFalse(count.increment());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
