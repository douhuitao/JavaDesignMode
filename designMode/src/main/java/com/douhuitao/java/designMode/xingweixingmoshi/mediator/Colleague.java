package com.douhuitao.java.designMode.xingweixingmoshi.mediator;
//ͬ����ĳ�����
public abstract class Colleague {
	  /**
     * �����н��߶���ÿһ��ͬ���඼֪������н��߶���
     */
     private final Mediator mediator;
     
     public Colleague(Mediator mediator){
         this.mediator = mediator;
     }
     
     public Mediator getMediator(){
         return mediator;
     }
     
}
