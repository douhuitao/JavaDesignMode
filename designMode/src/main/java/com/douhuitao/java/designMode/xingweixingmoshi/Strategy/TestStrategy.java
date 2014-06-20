package com.douhuitao.java.designMode.xingweixingmoshi.Strategy;

import com.douhuitao.java.designMode.xingweixingmoshi.Strategy.impl.BackDoor;
import com.douhuitao.java.designMode.xingweixingmoshi.Strategy.impl.BlackEnemy;
import com.douhuitao.java.designMode.xingweixingmoshi.Strategy.impl.GivenGreenLight;

public class TestStrategy {

	/**
	 * ������ģʽ
	 * �ֽ��㷨��ģʽ�����Ƕ����˲�ͬ���㷨�壬����֮����Ի����滻����ģʽ���㷨�ı仯������ʹ���㷨�Ŀͻ���
	 */
	public static void main(String[] args) {
		Context context;  
        
        //�յ�����ʱ��𿪵�һ��  
        System.out.println("----------�ոյ�����ʱ��𿪵�һ��---------------");  
        context = new Context(new BackDoor());  
        context.operate();//��ִ��  
        System.out.println("\n");  
          
        //�������ֲ�˼��ʱ���𿪵ڶ���  
        System.out.println("----------�����ֲ�˼�񣬲�ڶ�����---------------");  
        context = new Context(new GivenGreenLight());  
        context.operate();//��ִ��  
        System.out.println("\n");  
          
        //��Ȩ��С׷���ˣ�զ�죿�𿪵��������  
        System.out.println("----------��Ȩ��С׷���ˣ�զ�죿�𿪵��������---------------");  
        context = new Context(new BlackEnemy());  
        context.operate();//��ִ��  
        System.out.println("\n");  
	}

}
