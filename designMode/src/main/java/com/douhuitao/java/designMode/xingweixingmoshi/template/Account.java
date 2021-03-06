package com.douhuitao.java.designMode.xingweixingmoshi.template;

public abstract class Account {
	
	public final double calculateInterest(){
        double interestRate = doCalculateInterestRate();
        String accountType = doCalculateAccountType();
        double amount = calculateAmount(accountType);
        return amount * interestRate;
    }
    /**
     * ������������ʵ��
     */
    protected abstract String doCalculateAccountType();
    /**
     * ������������ʵ��
     */
    protected abstract double doCalculateInterestRate();
    /**
     * �������Ѿ�ʵ��
     */
    private double calculateAmount(String accountType){
        /**
         * ʡ����ص�ҵ���߼�
         */
        return 7243.00;
    }
}
