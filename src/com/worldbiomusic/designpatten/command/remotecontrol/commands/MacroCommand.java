package com.worldbiomusic.designpatten.command.remotecontrol.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.worldbiomusic.designpatten.command.remotecontrol.Command;

public class MacroCommand extends Command {
	List<Command> commands;

	public MacroCommand(List<Command> commands) {
		this.commands = commands;
	}

	public MacroCommand(Command... commands) {
		this.commands = new ArrayList<Command>(Arrays.asList(commands));
	}

	@Override
	protected void onTask() {
		this.commands.forEach(cmd -> cmd.on());
	}

	@Override
	protected void offTask() {
		// OFF 할때는 ON 한 커맨드의 반대 순서대로
		for (int i = this.commands.size() - 1; i >= 0; i--) {
			this.commands.get(i).off();
		}
	}

}
