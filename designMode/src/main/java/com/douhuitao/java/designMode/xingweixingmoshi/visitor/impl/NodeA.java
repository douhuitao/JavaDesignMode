package com.douhuitao.java.designMode.xingweixingmoshi.visitor.impl;

import com.douhuitao.java.designMode.xingweixingmoshi.visitor.Node;
import com.douhuitao.java.designMode.xingweixingmoshi.visitor.Visitor;

public class NodeA extends Node{
    /**
     * ���ܲ���
     */
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    /**
     * NodeA���еķ���
     */
    public String operationA(){
        return "NodeA";
    }

}
