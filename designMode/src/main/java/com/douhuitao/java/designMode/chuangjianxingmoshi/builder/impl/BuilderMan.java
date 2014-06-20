package com.douhuitao.java.designMode.chuangjianxingmoshi.builder.impl;

import com.douhuitao.java.designMode.chuangjianxingmoshi.builder.IBuilder;
import com.douhuitao.java.designMode.chuangjianxingmoshi.builder.bean.Man;
import com.douhuitao.java.designMode.chuangjianxingmoshi.builder.bean.Person;

public class BuilderMan implements IBuilder {
    private Person person;
	
	public BuilderMan() {
		super();
		this.person = new Man();
	}

	public void buildHead() {
		person.setHead("man head");

	}

	public void buildBody() {
		person.setBody("man body");

	}

	public void buildFoot() {
		person.setFoot("man foot");

	}

	public Person buildPerson() {
		return person;
	}

}
