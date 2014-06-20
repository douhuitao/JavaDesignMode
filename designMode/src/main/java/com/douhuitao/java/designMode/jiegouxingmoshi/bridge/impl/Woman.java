package com.douhuitao.java.designMode.jiegouxingmoshi.bridge.impl;

import com.douhuitao.java.designMode.jiegouxingmoshi.bridge.Clothing;
import com.douhuitao.java.designMode.jiegouxingmoshi.bridge.PersonAbstraction;

public class Woman extends PersonAbstraction {
    
	
	public Woman() {
		setType("woman");
	}

	@Override
	public void dress() {
		Clothing clothing=getClothing();
		clothing.personDressCloth(this);
	}
}
