package com.douhuitao.java.designMode.chuangjianxingmoshi.factory;

import com.douhuitao.java.designMode.chuangjianxingmoshi.factory.impl.WorkFactoryOne;
/**
 * 
 * @author douhuitao
 *��������
 *���󹤳�ģʽ���Ը��һ��
 */
public class TestFactory {
	public static void main(String[] args) {
		IWorkFactory wf=new WorkFactoryOne();
		IWork w=wf.getWork();
		w.doWork();
	}
}
