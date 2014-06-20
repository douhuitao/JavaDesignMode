package com.douhuitao.java.designMode.xingweixingmoshi.mediator;

import com.douhuitao.java.designMode.xingweixingmoshi.mediator.impl.CDDriver;
import com.douhuitao.java.designMode.xingweixingmoshi.mediator.impl.CPU;
import com.douhuitao.java.designMode.xingweixingmoshi.mediator.impl.MainBoard;
import com.douhuitao.java.designMode.xingweixingmoshi.mediator.impl.SoundCard;
import com.douhuitao.java.designMode.xingweixingmoshi.mediator.impl.VideoCard;


public class TestMediator {

	/**
	 * �н���ģʽ--MVC�е�controller����һ��Mediator
	 * ��һ���н��������װһϵ�еĶ��󽻻�
	 */
	public static void main(String[] args) {
		MainBoard mediator = new MainBoard();
        CDDriver cd = new CDDriver(mediator);
        CPU cpu = new CPU(mediator);
        VideoCard vc = new VideoCard(mediator);
        SoundCard sc = new SoundCard(mediator);

        mediator.setCdDriver(cd);
        mediator.setCpu(cpu);
        mediator.setVideoCard(vc);
        mediator.setSoundCard(sc);

        cd.readCD();

	}

}
