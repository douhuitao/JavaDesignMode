package com.douhuitao.java.designMode.jiegouxingmoshi.composite.impl;

import java.util.ArrayList;
import java.util.List;

import com.douhuitao.java.designMode.jiegouxingmoshi.composite.Company;

public class ConcreteCompany extends Company {
    
	private List<Company> cList;
	
	public ConcreteCompany() {
		this.cList = new ArrayList<Company>();
	}

	@Override
	public void add(Company company) {
		cList.add(company);
	}

	@Override
	public void remove(Company company) {
		cList.remove(company);
	}

	@Override
	public void display(int depth) {
		StringBuilder sb = new StringBuilder(""); 
		for(int i=0;i<depth;i++){
			sb.append("-");
		}
		  System.out.println(new String(sb) + this.getName()); 
		  for (Company c : cList) { 
		      c.display(depth + 2); 
		  } 
	}

	public List<Company> getcList() {
		return cList;
	}

	public void setcList(List<Company> cList) {
		this.cList = cList;
	}
	
	

}
