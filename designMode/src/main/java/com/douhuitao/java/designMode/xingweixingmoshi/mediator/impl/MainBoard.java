package com.douhuitao.java.designMode.xingweixingmoshi.mediator.impl;

import com.douhuitao.java.designMode.xingweixingmoshi.mediator.Colleague;
import com.douhuitao.java.designMode.xingweixingmoshi.mediator.Mediator;

public class MainBoard implements Mediator {
    
	private CDDriver cdDriver;
    private CPU cpu;
    private VideoCard videoCard;
    private SoundCard soundCard;
    
	public void changed(Colleague colleague) {
		 if(colleague == cdDriver){
             //��ʾ�����ȡ�����
             this.operateCDDriverReadData((CDDriver)colleague);
     }else if(colleague == cpu){
            //��ʾCPU���������
            this.operateCPU((CPU)colleague);
     }
	}

    /**
     * ��������ȡ��ݺ����������Ľ���
     * @param cd
     */
   public void operateCDDriverReadData(CDDriver cd){
            String data = cd.getData();
            this.cpu.executeData(data);
   }
   /**
   * ����CPU��������ݺ����������Ľ���
   * @param cpu
   */
  public void operateCPU(CPU cpu){
            String videoData = cpu.getVideoData();
            String soundData = cpu.getSoundData();
            this.videoCard.showData(videoData);
            this.soundCard.soundData(soundData);
  }
   
   
   
	public void setCdDriver(CDDriver cdDriver) {
		this.cdDriver = cdDriver;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public void setVideoCard(VideoCard videoCard) {
		this.videoCard = videoCard;
	}

	public void setSoundCard(SoundCard soundCard) {
		this.soundCard = soundCard;
	}
	
	

}
