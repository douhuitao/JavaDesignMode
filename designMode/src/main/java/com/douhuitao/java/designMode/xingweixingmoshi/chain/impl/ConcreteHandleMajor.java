package com.douhuitao.java.designMode.xingweixingmoshi.chain.impl;

import com.douhuitao.java.designMode.xingweixingmoshi.chain.RequestHandle;

public class ConcreteHandleMajor extends RequestHandle {
	@Override
	public void handleRequest() {
		if(getSuccessor()!=null){
			System.out.println("���������"+getSuccessor().getName());
			getSuccessor().handleRequest();
		}else{
			System.out.println("Major��������");
		}

	}
}
