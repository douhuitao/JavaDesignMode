package com.douhuitao.java.designMode.chuangjianxingmoshi.builder.impl;

import com.douhuitao.java.designMode.chuangjianxingmoshi.builder.IBuilder;
import com.douhuitao.java.designMode.chuangjianxingmoshi.builder.bean.Person;
import com.douhuitao.java.designMode.chuangjianxingmoshi.builder.bean.Woman;

public class BuilderWoman implements IBuilder {
    private Person person;
	
	public BuilderWoman() {
		super();
		this.person = new Woman();
	}

	public void buildHead() {
		person.setHead("woman head");

	}

	public void buildBody() {
		person.setBody("woman body");

	}

	public void buildFoot() {
		person.setFoot("woman foot");

	}

	public Person buildPerson() {
		return person;
	}

}
