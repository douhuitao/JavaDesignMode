package com.douhuitao.java.designMode.xingweixingmoshi.chain;

import com.douhuitao.java.designMode.xingweixingmoshi.chain.impl.ConcreteHandleHR;
import com.douhuitao.java.designMode.xingweixingmoshi.chain.impl.ConcreteHandleMajor;
import com.douhuitao.java.designMode.xingweixingmoshi.chain.impl.ConcreteHandleMaster;

public class TestChain {

	/**
	 * ������ģʽ
	 * ʹ��������л�ᴦ�����󣬴Ӷ��������ķ����ߺͽ�����֮�����Ϲ�ϵ��
	 * �������������һ���������������������ݸ�����֪����һ����������Ϊֹ��
	 */
	public static void main(String[] args) {
		RequestHandle hr=new ConcreteHandleHR();
		RequestHandle master=new ConcreteHandleMaster();
		RequestHandle major=new ConcreteHandleMajor();
		
		hr.setName("hr");
		hr.setSuccessor(master);
		
		master.setName("master");
		master.setSuccessor(major);
		
		major.setName("major");
		
		hr.handleRequest();

	}

}
