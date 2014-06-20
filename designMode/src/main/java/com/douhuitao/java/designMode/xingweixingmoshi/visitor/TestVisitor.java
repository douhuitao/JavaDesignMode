package com.douhuitao.java.designMode.xingweixingmoshi.visitor;

import com.douhuitao.java.designMode.xingweixingmoshi.visitor.impl.NodeA;
import com.douhuitao.java.designMode.xingweixingmoshi.visitor.impl.NodeB;
import com.douhuitao.java.designMode.xingweixingmoshi.visitor.impl.VisitorA;

public class TestVisitor {

	/**
	 *  @������ģʽ
	 */
	public static void main(String[] args) {
	    //����һ���ṹ����
        ObjectStructure os = new ObjectStructure();
        //��ṹ����һ���ڵ�
        os.add(new NodeA());
        //��ṹ����һ���ڵ�
        os.add(new NodeB());
        //����һ��������
        Visitor visitor = new VisitorA();
        os.action(visitor);

	}

}
