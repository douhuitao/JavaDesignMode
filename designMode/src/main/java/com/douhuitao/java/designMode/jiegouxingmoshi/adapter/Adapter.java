package com.douhuitao.java.designMode.jiegouxingmoshi.adapter;

public class Adapter implements Target {
    Adaptee adaptee;
	
	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public void methodOne() {
		adaptee.adapteeMethodOne();

	}

	public void methodTwo() {
		adaptee.adapteeMethodTwo();
	}

}
