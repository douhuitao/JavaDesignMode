package com.douhuitao.java.designMode.xingweixingmoshi.mediator.impl;

import com.douhuitao.java.designMode.xingweixingmoshi.mediator.Colleague;
import com.douhuitao.java.designMode.xingweixingmoshi.mediator.Mediator;

public class CDDriver extends Colleague {
	private String data;
	
	public CDDriver(Mediator mediator) {
        super(mediator);
    }
	
	 public String getData() {
         return data;
     }
	
	 public void readCD(){
         //����ǰ����Ƶ��ݣ����ź�����Ƶ���
        this.data = "Video Data,Sound Data";
       //֪ͨ���壬�Լ���״̬�����˱仯
        this.getMediator().changed(this);
}
	
}
