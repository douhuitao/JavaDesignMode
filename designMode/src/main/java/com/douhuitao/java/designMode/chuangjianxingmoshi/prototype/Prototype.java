package com.douhuitao.java.designMode.chuangjianxingmoshi.prototype;

import com.douhuitao.java.designMode.chuangjianxingmoshi.builder.bean.Person;

public class Prototype implements Cloneable {
    private String name;
    private String age;
    private String love;
    private Person person;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getLove() {
		return love;
	}
	public void setLove(String love) {
		this.love = love;
	}
    
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	@Override
	public String toString() {
		return "Prototype [name=" + name + ", age=" + age + ", love=" + love
				+ "]";
	}
    
}
