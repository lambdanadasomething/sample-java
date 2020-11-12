package com.foobar.processor;

public class Food {
	public String name;
	public int amount;
	public String unit;
	public String getString() {
		return String.format("%s, %d%s", this.name, this.amount, this.unit);
	}
}

