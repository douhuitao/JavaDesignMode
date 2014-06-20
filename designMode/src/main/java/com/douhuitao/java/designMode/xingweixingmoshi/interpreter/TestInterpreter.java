package com.douhuitao.java.designMode.xingweixingmoshi.interpreter;

public class TestInterpreter {

	/**
	 * ������ģʽ  
	 * ��һ�����ԣ���������ķ���һ�ֱ�ʾ��������һ�������������������ʹ�øñ�ʾ�����������еľ���
	 */
	public static void main(String[] args) {
		Contex ctx = new Contex();
		
		Variable x = new Variable("x");
		Variable y = new Variable("y");
		Constant c = new Constant(true);
		
		ctx.assign(x, false);
		ctx.assign(y, true);
		
		Expression exp = new Or(new And(c,x) , new And(y,new Not(x)));

		System.out.println("x=" + x.interpret(ctx));
        System.out.println("y=" + y.interpret(ctx));
        System.out.println(exp.toString() + "=" + exp.interpret(ctx));
	}

}
