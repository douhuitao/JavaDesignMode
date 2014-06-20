package com.douhuitao.java.designMode.xingweixingmoshi.mediator.impl;

import com.douhuitao.java.designMode.xingweixingmoshi.mediator.Colleague;
import com.douhuitao.java.designMode.xingweixingmoshi.mediator.Mediator;

public class CPU extends Colleague {
	/**
	 * ��Ƶ���
	 */
	private String videoData;
	/**
	 * ��Ƶ���
	 */
	private String soundData;

	public CPU(Mediator mediator) {
		super(mediator);
	}

	public String getVideoData() {
		return videoData;
	}

	public String getSoundData() {
		return soundData;
	}

	/**
	 * ������ݣ�����ݷֽ����Ƶ��ݺ���Ƶ���
	 * 
	 * @param data
	 *            ����������
	 */
	public void executeData(String data) {
		// �ֽ���ݣ�ǰ������Ƶ��ݣ���������Ƶ���
		String[] ss = data.split(",");
		this.videoData = ss[0];
		this.soundData = ss[1];
		// ֪ͨ���壬CPU�Ĺ������
		this.getMediator().changed(this);
	}
}
