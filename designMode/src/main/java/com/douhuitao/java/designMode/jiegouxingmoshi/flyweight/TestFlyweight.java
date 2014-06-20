package com.douhuitao.java.designMode.jiegouxingmoshi.flyweight;

public class TestFlyweight {

	/**
	 * ��Ԫģʽ�����ù��?����Ч��֧�ִ���ϸ���ȵĶ���---���ʹ�����������Ĵ洢����
	 */
	public static void main(String[] args) {
		Website ws=WebsiteFactory.getWebsite("weibo");
		ws.use();
		Website ws2=WebsiteFactory.getWebsite("weibo");
		ws2.use();
		Website ws3=WebsiteFactory.getWebsite("sport");
		ws3.use();
	}

}
