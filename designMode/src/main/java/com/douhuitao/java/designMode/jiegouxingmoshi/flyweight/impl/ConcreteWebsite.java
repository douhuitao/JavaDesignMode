package com.douhuitao.java.designMode.jiegouxingmoshi.flyweight.impl;

import com.douhuitao.java.designMode.jiegouxingmoshi.flyweight.Website;

public class ConcreteWebsite extends Website {
    private String name="";
    
	public ConcreteWebsite(String name) {
		this.name = name;
	}

	@Override
	public void use() {
           System.out.println("web site:"+name);
	}

}
