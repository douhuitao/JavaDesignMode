package com.douhuitao.java.designMode.chuangjianxingmoshi.prototype;

import com.douhuitao.java.designMode.chuangjianxingmoshi.builder.bean.Person;
import com.douhuitao.java.designMode.chuangjianxingmoshi.prototype.impl.ConcretePrototype;

public class TestPrototype {

	/**
	 * ԭ��ģʽ
	 * ��ԭ��ʵ��ָ��������������࣬����ͨ����Щԭ�ʹ����µĶ���
	 * ��ʵ���Ǵ�һ�������ٴ�������һ���ɶ��ƵĶ��󣬶��Ҳ���Ҫ֪���κδ�����ϸ��
	 * 
	 * �и������ص��ǿ�¡һ�����еĶ��������¡�Ľ����2�֣�һ������ǳ���ƣ���һ�������
	 */
	public static void main(String[] args) {
		Person p1=new Person();
		p1.setHead("datou");
		
		Prototype p=new ConcretePrototype("dou", "22", "basketball",p1);
		Prototype p2=(Prototype)p.clone();//ǳcopy������һ������Person�Ļ���copy���Ƕ��������
		
		p2.getPerson().setHead("xiaotou");
        System.out.println(p.getPerson());
        System.out.println(p2.getPerson());
	}

}
