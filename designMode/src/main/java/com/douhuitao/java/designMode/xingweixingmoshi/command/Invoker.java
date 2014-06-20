package com.douhuitao.java.designMode.xingweixingmoshi.command;

import java.util.ArrayList;
import java.util.List;

/**
 * �����߳����������
 * @author douhuitao
 *
 */
public class Invoker {
	private List<Command> commands=new ArrayList<Command>();
    
	public void runCommand(){
		for(Command command:commands){
			command.execute();
		}
	}
	
	public void unDoCommand(){
		for(Command command:commands){
			command.undo();
		}
	}
	
	public void addCommand(Command c){
		//���ж������Ƿ����
		commands.add(c);
	}
   	
	public void removeCommand(Command c){
		commands.remove(c);
	}
	
	public List<Command> getCommands() {
		return commands;
	}

	public void setCommands(List<Command> commands) {
		this.commands = commands;
	}

}
