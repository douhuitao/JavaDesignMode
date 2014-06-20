package com.douhuitao.java.designMode.jiegouxingmoshi.facade;

public class TestFacade {

	/**
	 * ���ģʽ --�����ڸ�����ϵͳ
	 * Ϊ��ϵͳ�е�һ��ӿ��ṩһ��һֱ�Ľ��棬��ģʽ������һ���߲�ӿڣ�����ӿ��ǵ���һ��ϵͳ�������ʹ��
	 */
	public static void main(String[] args) {
		Facade f=new Facade();
		f.methodA();
		f.methodB();
		f.methodC();
	}

}
