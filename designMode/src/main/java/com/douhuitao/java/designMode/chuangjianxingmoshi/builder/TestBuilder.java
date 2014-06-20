package com.douhuitao.java.designMode.chuangjianxingmoshi.builder;

import com.douhuitao.java.designMode.chuangjianxingmoshi.builder.bean.Person;
import com.douhuitao.java.designMode.chuangjianxingmoshi.builder.impl.BuilderWoman;
/**
 * 
 * @author douhuitao
 *������ģʽ����һ�����Ӷ���Ĺ�������ı�ʾ���룬ʹ��ͬ��Ĺ�����̿��Դ�����ͬ�ı�ʾ��

 */
public class TestBuilder {
	public static void main(String[] args) {
		Director dr=new Director();
		Person p=dr.constructPerson(new BuilderWoman());
		System.out.println(p);
	}
}
