package com.douhuitao.java.designMode.jiegouxingmoshi.decorator;

import com.douhuitao.java.designMode.jiegouxingmoshi.decorator.impl.DecoratorDrink;
import com.douhuitao.java.designMode.jiegouxingmoshi.decorator.impl.DecoratorEat;
import com.douhuitao.java.designMode.jiegouxingmoshi.decorator.impl.DecoratorSleep;

public class TestDecorator {

	/**
	 * װ����ģʽ-��̬�ĸ�һ���������һЩ�����ְ��Ϊ���еĹ��ܶ�̬����Ӹ��Ĺ��ܣ�
	 * 
	 * ��ͬ�ڹ�����ģʽ��������̲��ȶ�
	 * 
	 */
	public static void main(String[] args) {
		Person person=new ConcretePerson();
		
		DecoratorPerson decoratorDrink=new DecoratorDrink();
		DecoratorPerson decoratorEat=new DecoratorEat();
		DecoratorPerson decoratorSleep=new DecoratorSleep();
		
		decoratorDrink.setPerson(person);
		decoratorEat.setPerson(decoratorDrink);
		decoratorSleep.setPerson(decoratorEat);
		
		decoratorSleep.live();

	}

}
