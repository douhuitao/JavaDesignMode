package com.douhuitao.java.designMode.jiegouxingmoshi.bridge.impl;

import com.douhuitao.java.designMode.jiegouxingmoshi.bridge.Clothing;
import com.douhuitao.java.designMode.jiegouxingmoshi.bridge.PersonAbstraction;

public class Man extends PersonAbstraction {
    
	
	public Man() {
		setType("man");
	}

	@Override
	public void dress() {
		Clothing clothing=getClothing();
		clothing.personDressCloth(this);
	}

}
