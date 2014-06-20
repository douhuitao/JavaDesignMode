package com.douhuitao.java.designMode.xingweixingmoshi.memento;

public class TestMemento {

	/**
	 * ����¼��Memento��ģʽ�ֳƱ�ǣ�Token��ģʽ
	 * �ڲ��ƻ���װ�Ե�ǰ���£�����һ��������ڲ�״̬�����ڸö���֮�Ᵽ�����״̬��
	 * �����Ժ�Ϳɽ��ö���ָ���ԭ�ȱ����״̬��
	 * 
	 * �������Ҫ�ṩ�ع�����������ʹ�ñ���¼ģʽ�ǳ��ʺϣ�����jdbc������������ı��༭����Ctrl+Z�ָ��ȡ�
	 */
	public static void main(String[] args) {
		
		//����״̬����״̬������չ
		 Originator originator = new Originator();  
		 originator.setState("start"); 
		 System.out.println("��ʼ״̬:"+originator.getState());  
		 
		 Caretaker caretaker = new Caretaker(); 
		 caretaker.setMemento(originator.createMemento());
		 
		 originator.setState("doing"); 
		 System.out.println("�ı��״̬:"+originator.getState());  
		 
		 originator.restoreMemento(caretaker.getMemento());  
		 System.out.println("�ָ���״̬:"+originator.getState());
	}

}
