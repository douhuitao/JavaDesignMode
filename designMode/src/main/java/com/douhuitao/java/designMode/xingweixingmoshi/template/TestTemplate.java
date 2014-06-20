package com.douhuitao.java.designMode.xingweixingmoshi.template;

import com.douhuitao.java.designMode.xingweixingmoshi.template.impl.CDAccount;
import com.douhuitao.java.designMode.xingweixingmoshi.template.impl.MoneyMarketAccount;

public class TestTemplate {

	/**
	 * ģ��ģʽ
	 * Servlet��ʹ���˸�ģʽ
	 */
	public static void main(String[] args) {
		Account account = new MoneyMarketAccount();
        System.out.println("�����г��˺ŵ���Ϣ���Ϊ��" + account.calculateInterest());
        account = new CDAccount();
        System.out.println("�����˺ŵ���Ϣ���Ϊ��" + account.calculateInterest());

	}

}
