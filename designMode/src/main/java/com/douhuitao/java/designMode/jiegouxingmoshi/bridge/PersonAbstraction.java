package com.douhuitao.java.designMode.jiegouxingmoshi.bridge;

public abstract class PersonAbstraction {
	private Clothing clothing;
	private String type;

	public Clothing getClothing() {
		return clothing;
	}

	public void setClothing(Clothing clothing) {
		this.clothing = clothing;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    
	public abstract void dress();
}
