package com.douhuitao.java.designMode.xingweixingmoshi.state;

import com.douhuitao.java.designMode.xingweixingmoshi.state.impl.Off;

public class TestState {

	/**
	 * ״̬ģʽ
	 *  ��һ���������Ϊȡ�������״̬�����������������ʱ�̸��״̬�ı������Ϊʱ���Ϳ��Կ���ʹ��״̬ģʽ����
	 */
	public static void main(String[] args) {
		Light light = new Light(new Off());
		light.pressSwitch();
		light.pressSwitch();
		light.pressSwitch();
		light.pressSwitch();

	}

}
