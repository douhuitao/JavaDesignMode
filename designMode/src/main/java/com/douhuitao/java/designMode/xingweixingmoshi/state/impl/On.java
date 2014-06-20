package com.douhuitao.java.designMode.xingweixingmoshi.state.impl;

import com.douhuitao.java.designMode.xingweixingmoshi.state.Light;
import com.douhuitao.java.designMode.xingweixingmoshi.state.LightState;

public class On extends LightState {

	@Override
	public void pressSwitch(Light light) {
          System.out.println("turn on the light");
          light.setState(new Off());
	}

}
