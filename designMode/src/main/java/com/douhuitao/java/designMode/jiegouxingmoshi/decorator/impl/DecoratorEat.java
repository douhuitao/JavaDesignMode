package com.douhuitao.java.designMode.jiegouxingmoshi.decorator.impl;

import com.douhuitao.java.designMode.jiegouxingmoshi.decorator.DecoratorPerson;

public class DecoratorEat extends DecoratorPerson {
	
	@Override
	public void  live(){
		eat();
		super.live();
	}
	
     private void eat(){
    	 System.out.println("person eat");
     }
}
