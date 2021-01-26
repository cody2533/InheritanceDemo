package com.revature;

public class RedMartian extends Martian{
	
	public RedMartian(int id, String name) {
		super(id, name);
	}

	@Override
	public String speak() {
		return String.format("I am %s and I am here to destroy you all!", getName());
	}
	
}
