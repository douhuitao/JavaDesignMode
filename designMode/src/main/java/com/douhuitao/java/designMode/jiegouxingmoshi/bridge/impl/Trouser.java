package com.douhuitao.java.designMode.jiegouxingmoshi.bridge.impl;

import com.douhuitao.java.designMode.jiegouxingmoshi.bridge.Clothing;
import com.douhuitao.java.designMode.jiegouxingmoshi.bridge.PersonAbstraction;

public class Trouser extends Clothing {

	@Override
	public void personDressCloth(PersonAbstraction person) {
		System.out.println(person.getType()+" chuan kuzi!");
	}

}
