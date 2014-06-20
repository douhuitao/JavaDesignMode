package com.douhuitao.java.designMode.xingweixingmoshi.mediator.impl;

import com.douhuitao.java.designMode.xingweixingmoshi.mediator.Colleague;
import com.douhuitao.java.designMode.xingweixingmoshi.mediator.Mediator;

public class SoundCard extends Colleague {

    public SoundCard(Mediator mediator){
             super(mediator);
    }
    /**
     * ��������
     * @param data ��Ƶ���
     */
    public void soundData(String data){
             System.out.println("��������" + data);
    }
}
