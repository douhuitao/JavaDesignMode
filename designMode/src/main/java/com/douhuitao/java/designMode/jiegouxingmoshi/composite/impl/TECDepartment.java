package com.douhuitao.java.designMode.jiegouxingmoshi.composite.impl;

import com.douhuitao.java.designMode.jiegouxingmoshi.composite.Company;

public class TECDepartment extends Company {
    
	
	public TECDepartment() {
		super();
	}

	public TECDepartment(String name) {
		super(name);
	}

	@Override
	public void add(Company company) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Company company) {
		// TODO Auto-generated method stub

	}

	@Override
	public void display(int depth) {
		StringBuilder sb = new StringBuilder(""); 
		for (int i = 0; i < depth; i++) { 
		            sb.append("-"); 
		} 
		System.out.println(new String(sb) + this.getName() ) ;
	}

}
