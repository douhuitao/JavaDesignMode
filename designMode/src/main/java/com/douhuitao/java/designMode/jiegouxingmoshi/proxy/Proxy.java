package com.douhuitao.java.designMode.jiegouxingmoshi.proxy;

public class Proxy extends Subject {
    private Subject realSubject;
	@Override
	public void request() {
		realSubject=new RealSubject();
		System.out.println("do sth before request");
		realSubject.request();
		System.out.println("do sth after request");

	}

}
