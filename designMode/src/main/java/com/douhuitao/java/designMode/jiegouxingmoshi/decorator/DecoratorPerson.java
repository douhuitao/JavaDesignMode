package com.douhuitao.java.designMode.jiegouxingmoshi.decorator;


public abstract class DecoratorPerson implements Person {
    
	private Person person;
	
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void live() {
        person.live();
    }
}
