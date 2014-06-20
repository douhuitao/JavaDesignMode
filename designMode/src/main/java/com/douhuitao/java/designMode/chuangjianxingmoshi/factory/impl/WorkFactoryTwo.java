package com.douhuitao.java.designMode.chuangjianxingmoshi.factory.impl;

import com.douhuitao.java.designMode.chuangjianxingmoshi.factory.IWork;
import com.douhuitao.java.designMode.chuangjianxingmoshi.factory.IWorkFactory;

public class WorkFactoryTwo implements IWorkFactory{

	public IWork getWork() {
		return new WorkTwo();
	}
}
