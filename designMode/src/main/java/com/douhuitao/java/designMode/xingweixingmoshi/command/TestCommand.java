package com.douhuitao.java.designMode.xingweixingmoshi.command;

import com.douhuitao.java.designMode.xingweixingmoshi.command.impl.ConcreteCommand;

public class TestCommand {

	/**
	 * ����ģʽ
	 * ��һ��������߲�����װ��һ�������У��Ӷ�ʹ������ò�ͬ������Կͻ��˽��в���������Ŷӻ��߼�¼������־�������ṩ����ĳ���ͻָ����ܡ�
	 * 
	 */
	public static void main(String[] args) {
		 //����������
		 Receiver receiver = new Receiver();
		//����������󣬲�������Ľ�����
		 Command command1 = new ConcreteCommand(receiver);
		 Command command2= new ConcreteCommand(receiver);
		 Command command3 = new ConcreteCommand(receiver);
		 
		//���������ߣ�������������ý�ȥ
		 Invoker invoker = new Invoker();
		 invoker.addCommand(command1);
		 invoker.addCommand(command3);
		 invoker.addCommand(command2);
		 
		 invoker.runCommand();
		 invoker.unDoCommand();
	}

}
