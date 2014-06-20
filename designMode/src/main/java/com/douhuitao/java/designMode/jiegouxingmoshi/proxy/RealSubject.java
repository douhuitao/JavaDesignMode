package com.douhuitao.java.designMode.jiegouxingmoshi.proxy;

public class RealSubject extends Subject {

	@Override
	public void request() {
         System.out.println("real request");
	}

}
