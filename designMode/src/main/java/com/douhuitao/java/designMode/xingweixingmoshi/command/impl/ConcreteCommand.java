package com.douhuitao.java.designMode.xingweixingmoshi.command.impl;


import com.douhuitao.java.designMode.xingweixingmoshi.command.Command;
import com.douhuitao.java.designMode.xingweixingmoshi.command.Receiver;

public class ConcreteCommand implements Command {
    
	private Receiver receiver;
	
	
	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	public void execute() {
		receiver.action();

	}

	public void undo() {
		receiver.unAction();

	}

}
