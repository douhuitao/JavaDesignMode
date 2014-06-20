package com.douhuitao.java.designMode.jiegouxingmoshi.facade;

import com.douhuitao.java.designMode.jiegouxingmoshi.facade.impl.ServiceA;
import com.douhuitao.java.designMode.jiegouxingmoshi.facade.impl.ServiceB;
import com.douhuitao.java.designMode.jiegouxingmoshi.facade.impl.ServiceC;

public class Facade {
    private OldSystemA sa;
    private OldSystemB sb;
    private OldSystemC sc;
	public Facade() {
		this.sa = new ServiceA();
		this.sb = new ServiceB();
		this.sc = new ServiceC();
	}
    
	public void methodA(){
		 sa.serviceA();
		 sb.serviceB();
	}
	
	public void methodB(){
		 sb.serviceB();
		 sc.serviceC();
	}
	
	public void methodC(){
		 sa.serviceA();
		 sc.serviceC();
	}
	
	
}
