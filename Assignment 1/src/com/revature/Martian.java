package com.revature;

public abstract class Martian {
	
	private int id;
	private String name;
	
	public Martian(int id, String name) {
		this.id = id;
		this.setName(name);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o){
		Martian m;
		if(o instanceof Martian){
			m = (Martian)o;
			if(id == m.getId())
				return true;
		}
		return false;
	}
	
	public abstract String speak();
	
	@Override
	public String toString() {
		return String.format("name=%s, id=%d", name, id);
	}
	
}
