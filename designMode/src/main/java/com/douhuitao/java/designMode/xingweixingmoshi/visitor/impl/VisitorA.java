package com.douhuitao.java.designMode.xingweixingmoshi.visitor.impl;

import com.douhuitao.java.designMode.xingweixingmoshi.visitor.Visitor;

public class VisitorA implements Visitor {
    /**
     * ��Ӧ��NodeA�ķ��ʲ���
     */
    public void visit(NodeA node) {
        System.out.println(node.operationA());
    }
    /**
     * ��Ӧ��NodeB�ķ��ʲ���
     */
    public void visit(NodeB node) {
        System.out.println(node.operationB());
    }

}
