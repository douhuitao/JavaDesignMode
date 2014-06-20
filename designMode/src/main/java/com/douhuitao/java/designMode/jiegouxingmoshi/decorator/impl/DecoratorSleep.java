package com.douhuitao.java.designMode.jiegouxingmoshi.decorator.impl;

import com.douhuitao.java.designMode.jiegouxingmoshi.decorator.DecoratorPerson;

public class DecoratorSleep extends DecoratorPerson {
	
	@Override
	public void  live(){
		sleep();
		super.live();
	}
	
     private void sleep(){
    	 System.out.println("person sleep");
     }
}
