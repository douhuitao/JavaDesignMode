package com.douhuitao.java.designMode.jiegouxingmoshi.decorator.impl;

import com.douhuitao.java.designMode.jiegouxingmoshi.decorator.DecoratorPerson;

public class DecoratorDrink extends DecoratorPerson {
	
	@Override
	public void  live(){
		drink();
		super.live();
	}
	
     private void drink(){
    	 System.out.println("person drink");
     }
}
