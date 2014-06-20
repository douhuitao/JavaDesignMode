package com.douhuitao.java.designMode.xingweixingmoshi.mediator;
// �н��ߣ��������ͬ�¶����ͨ�Žӿ�
public interface Mediator {
    /**
     * ͬ�¶���������ı��ʱ����֪ͨ�н��ߵķ���
     * ���н���ȥ������Ӧ��������ͬ�¶���Ľ���
     * @param colleague ͬ�¶������?�����н��߶���ͨ�����ʵ��
     * ȥ��ȡͬ�¶����״̬
     */
   public void changed(Colleague colleague);
}
