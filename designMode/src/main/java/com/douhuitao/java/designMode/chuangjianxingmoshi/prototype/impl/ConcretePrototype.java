package com.douhuitao.java.designMode.chuangjianxingmoshi.prototype.impl;

import com.douhuitao.java.designMode.chuangjianxingmoshi.builder.bean.Person;
import com.douhuitao.java.designMode.chuangjianxingmoshi.prototype.Prototype;

public class ConcretePrototype extends Prototype {

	public ConcretePrototype(String name,String age,String love,Person person) {
		super();
		setName(name);
		setAge(age);
		setLove(love);
		setPerson(person);
	}
   
}
