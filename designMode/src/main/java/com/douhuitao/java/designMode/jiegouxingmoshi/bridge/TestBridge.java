package com.douhuitao.java.designMode.jiegouxingmoshi.bridge;

import com.douhuitao.java.designMode.jiegouxingmoshi.bridge.impl.Jacket;
import com.douhuitao.java.designMode.jiegouxingmoshi.bridge.impl.Man;
import com.douhuitao.java.designMode.jiegouxingmoshi.bridge.impl.Trouser;
import com.douhuitao.java.designMode.jiegouxingmoshi.bridge.impl.Woman;

public class TestBridge {
	/**����  ��С��  ���̲����̵�����
	 * 
	 * 
	 * �����󲿷ֺ������Ϊ���ַ��룬ʹ���Ƕ����Զ����ı仯
	 * ��ʵ��ϵͳ�ж�Ƕȷ��࣬ÿ�ַ��඼�����б仯����ô�����ֶ�Ƕȷ�����������Ƕ����仯���������
	 */
	public static void main(String[] args) {
		PersonAbstraction man=new Man();
		PersonAbstraction women=new Woman();
		
		Clothing jack=new Jacket();
		Clothing trouser=new Trouser();
		
		man.setClothing(jack);
		man.dress();
		man.setClothing(trouser);
		man.dress();
		
		women.setClothing(jack);
		women.dress();
		women.setClothing(trouser);
		women.dress();
		
	}

}
