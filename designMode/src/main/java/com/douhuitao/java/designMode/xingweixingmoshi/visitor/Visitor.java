package com.douhuitao.java.designMode.xingweixingmoshi.visitor;

import com.douhuitao.java.designMode.xingweixingmoshi.visitor.impl.NodeA;
import com.douhuitao.java.designMode.xingweixingmoshi.visitor.impl.NodeB;

public interface Visitor {
	  /**
     * ��Ӧ��NodeA�ķ��ʲ���
     */
    public void visit(NodeA node);
    /**
     * ��Ӧ��NodeB�ķ��ʲ���
     */
    public void visit(NodeB node);
}
