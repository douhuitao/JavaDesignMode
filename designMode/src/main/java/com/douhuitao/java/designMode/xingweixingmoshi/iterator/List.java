package com.douhuitao.java.designMode.xingweixingmoshi.iterator;

public interface List {
	Iterator iterator();
	Object get(int index);
	int getSize();
	void add(Object obj);
}
