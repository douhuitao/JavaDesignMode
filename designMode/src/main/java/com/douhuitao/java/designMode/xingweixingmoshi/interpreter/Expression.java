package com.douhuitao.java.designMode.xingweixingmoshi.interpreter;

public abstract class Expression {
	  /**
     * �Ի���Ϊ׼�����������͸���κ�һ�����ʽ
     */
    public abstract boolean interpret(Contex ctx);
    /**
     * �����������ʽ�ڽṹ���Ƿ���ͬ
     */
    public abstract boolean equals(Object obj);
    /**
     * ���ر��ʽ��hash code
     */
    public abstract int hashCode();
    /**
     * �����ʽת�����ַ�
     */
    public abstract String toString();
	
}
