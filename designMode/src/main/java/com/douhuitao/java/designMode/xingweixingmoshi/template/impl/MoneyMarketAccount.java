package com.douhuitao.java.designMode.xingweixingmoshi.template.impl;

import com.douhuitao.java.designMode.xingweixingmoshi.template.Account;

public class MoneyMarketAccount extends Account {

    @Override
    protected String doCalculateAccountType() {
        
        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {
        
        return 0.045;
    }

}
