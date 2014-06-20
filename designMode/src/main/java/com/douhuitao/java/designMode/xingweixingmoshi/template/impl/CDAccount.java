package com.douhuitao.java.designMode.xingweixingmoshi.template.impl;

import com.douhuitao.java.designMode.xingweixingmoshi.template.Account;

public class CDAccount extends Account {

    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }

}