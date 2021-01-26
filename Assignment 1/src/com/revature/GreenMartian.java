package com.revature;

public class GreenMartian extends Martian{
	
	public GreenMartian(int id, String name) {
		super(id, name);
	}

	@Override
	public String speak() {
		return String.format("I am %s. I come in peace.", getName());
	}
	
}
