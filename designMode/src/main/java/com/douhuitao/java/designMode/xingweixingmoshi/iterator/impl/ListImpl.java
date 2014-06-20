package com.douhuitao.java.designMode.xingweixingmoshi.iterator.impl;

import com.douhuitao.java.designMode.xingweixingmoshi.iterator.Iterator;
import com.douhuitao.java.designMode.xingweixingmoshi.iterator.List;

public class ListImpl implements List {
	private Object[] list;
	private int index;
	private int size;
	
	
	public ListImpl() {
		this.index=0;
		this.size=0;
		this.list=new Object[100];
	}

	public Iterator iterator() {
		return new IteratorImpl(this);
	}

	public Object get(int index) {
		return list[index];
	}

	public int getSize() {
		return this.size;
	}

	public void add(Object obj) {
		 list[index++] = obj;
	     size++;
	}

}
