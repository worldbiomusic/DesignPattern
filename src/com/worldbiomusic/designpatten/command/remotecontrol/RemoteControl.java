package com.worldbiomusic.designpatten.command.remotecontrol;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.worldbiomusic.designpatten.command.remotecontrol.product.NoCommand;

public class RemoteControl {
	private List<Command> commands;
	private Stack<Command> actionList;

	public RemoteControl() {
		// commands
		this.commands = new ArrayList<Command>();

		for (int i = 0; i < 5; i++) {
			this.commands.add(new NoCommand());
		}

		// actionList
		this.actionList = new Stack<Command>();
	}

	public void addCommand(int slot, Command command) {
		// NoCommand일떄만 동작 (NoCommand일때가 아무런 Command가 없다는 뜻이므로)
		if (this.commands.get(slot) instanceof NoCommand) {
			this.commands.set(slot, command);
		}
	}

	public void removeCommand(int slot) {
		this.commands.set(slot, new NoCommand());
	}

	public void on(int slot) {
		Command command = this.commands.get(slot);
		command.on();
		this.actionList.add(command);
	}

	public void off(int slot) {
		Command command = this.commands.get(slot);
		command.off();
		this.actionList.add(command);
	}

	public void undo() {
		Command command = this.actionList.pop();
		command.undo();
	}
}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
