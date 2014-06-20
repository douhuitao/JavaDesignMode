package com.douhuitao.java.designMode.jiegouxingmoshi.composite;

import com.douhuitao.java.designMode.jiegouxingmoshi.composite.impl.ConcreteCompany;
import com.douhuitao.java.designMode.jiegouxingmoshi.composite.impl.HRDepartment;
import com.douhuitao.java.designMode.jiegouxingmoshi.composite.impl.TECDepartment;

public class TestComposite {

	/**
	 * ���ģʽ����������ϳ����νṹ�Ա�ʾ�����֡����塱�Ĳ�νṹ 
	 */
	public static void main(String[] args) {
		Company root=new ConcreteCompany();
		root.setName("�����ܹ�˾");
		root.add(new HRDepartment("�ܹ�˾������Դ��"));
		root.add(new TECDepartment("�ܹ�˾����"));
		
		Company shandongCom = new ConcreteCompany(); 
		shandongCom.setName("ɽ���ֹ�˾");
		shandongCom.add(new HRDepartment("ɽ���ֹ�˾������Դ��")); 
		shandongCom.add(new TECDepartment("ɽ���ֹ�˾����")); 		
		 Company zaozhuangCom = new ConcreteCompany(); 
		 zaozhuangCom.setName("��ׯ���´�");
		 zaozhuangCom.add(new HRDepartment("��ׯ���´�����")); 
		 zaozhuangCom.add(new TECDepartment("��ׯ���´�������Դ��")); 		 
		 Company jinanCom = new ConcreteCompany();
		 jinanCom.setName("���ϰ��´�");
		 jinanCom.add(new TECDepartment("���ϰ��´�����")); 
		 jinanCom.add(new HRDepartment("���ϰ��´�������Դ��"));
		 
		 shandongCom.add(zaozhuangCom);
		 shandongCom.add(jinanCom);
		 
		Company huadongCom = new ConcreteCompany(); 
		huadongCom.setName("�����ֹ�˾");
		huadongCom.add(new HRDepartment("�����ֹ�˾������Դ��")); 
		huadongCom.add(new TECDepartment("�����ֹ�˾����")); 		
		Company hangzhouCom = new ConcreteCompany(); 
		hangzhouCom.setName("���ݰ��´�");
		hangzhouCom.add(new HRDepartment("���ݰ��´�����")); 
		hangzhouCom.add(new TECDepartment("���ݰ��´�������Դ��")); 		 
		Company nanjingCom = new ConcreteCompany();
		nanjingCom.setName("�Ͼ����´�");
		nanjingCom.add(new TECDepartment("�Ͼ����´�����")); 
		nanjingCom.add(new HRDepartment("�Ͼ����´�������Դ��"));

		huadongCom.add(nanjingCom);
		huadongCom.add(hangzhouCom);
		
		root.add(shandongCom);
		root.add(huadongCom);
		
		root.display(0);
		 

	}

}
