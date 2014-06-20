package com.douhuitao.java.designMode.chuangjianxingmoshi.builder;

import com.douhuitao.java.designMode.chuangjianxingmoshi.builder.bean.Person;

public interface IBuilder {
    void buildHead();
    void buildBody();
    void buildFoot();
    Person buildPerson();
}
