package com.douhuitao.java.designMode.jiegouxingmoshi.adapter;

public class TestAdapter {

	/**
	 * ��һ����Ľӿ�ת���ɿͻ�ϣ�������һ���ӿ�
	 */
	public static void main(String[] args) {
		Target t=new Adapter(new Adaptee());
		t.methodOne();
		t.methodTwo();
	}

}
