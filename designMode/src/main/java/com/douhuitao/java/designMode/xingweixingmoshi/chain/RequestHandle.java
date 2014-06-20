package com.douhuitao.java.designMode.xingweixingmoshi.chain;

public abstract class RequestHandle {
	private RequestHandle successor;
	private String name;
	
	public abstract void handleRequest();
	
	public RequestHandle getSuccessor() {
		return successor;
	}
	public void setSuccessor(RequestHandle successor) {
		this.successor = successor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
