package com.douhuitao.java.designMode.chuangjianxingmoshi.builder;

import com.douhuitao.java.designMode.chuangjianxingmoshi.builder.bean.Person;

public class Director {
   public Person constructPerson(IBuilder builder){
	   builder.buildFoot();
	   builder.buildBody();
	   return builder.buildPerson();
   }
}
