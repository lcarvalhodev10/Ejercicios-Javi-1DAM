package unit;

public class Counter {
	private int value; 
	private int maxValue; 
	private String model;
	
	public Counter(int maxValue, String model) {
		this.value = 0;
		this.maxValue = maxValue;
		this.model = model;
	} 
	
	public Counter() {
		this(100_000, "N-COUNTER");
	}
	
	public Counter(Counter c) {
		this.value = c.value; 
		this.maxValue = c.maxValue; 
		this.model = c.model; 
	}
	
	public void show() {
		System.out.printf("Contador: modelo (%s) y valor %d de %d.%n",
				model, value, maxValue);
	}
	
	public boolean increment() {
		return increment(1); 
	}
	
	public boolean increment(int n) {
		if(value < maxValue) {
			value += n; 
			return true; 
		} else {
			value = maxValue;
			return false; 
		}
	}
	
	public boolean decrement() {
		return decrement(1); 
	}
	
	public boolean decrement(int n) {
			value -= n; 
			return true; 
	}
	
	public boolean reset() {
		if(value == maxValue) {
			value = 0; 
			return true; 
		} 
		return false; 
	}

	public int getValue() {
		return value;
	}

	public int getMaxValue() {
		return maxValue;
	}
	
	
	
	
}
