package com.douhuitao.java.designMode.xingweixingmoshi.mediator.impl;

import com.douhuitao.java.designMode.xingweixingmoshi.mediator.Colleague;
import com.douhuitao.java.designMode.xingweixingmoshi.mediator.Mediator;

public class VideoCard extends Colleague {

    public VideoCard(Mediator mediator) {
              super(mediator);
    }
    /**
     * ��ʾ��Ƶ���
     * @param data ����ʾ�����
     */
    public void showData(String data){
              System.out.println("�����ڹۿ����ǣ�" + data);
    }
}
