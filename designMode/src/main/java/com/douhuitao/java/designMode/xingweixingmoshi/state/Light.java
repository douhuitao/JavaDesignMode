package com.douhuitao.java.designMode.xingweixingmoshi.state;

public class Light {
    private LightState state;

	public Light(LightState state) {
		this.state = state;
	}
    
	public void pressSwitch(){
		state.pressSwitch(this);
	}

	public LightState getState() {
		return state;
	}

	public void setState(LightState state) {
		this.state = state;
	}
	
	
}
