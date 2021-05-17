package com.worldbiomusic.designpatten.command.remotecontrol.product;

import com.worldbiomusic.designpatten.command.remotecontrol.Command;

public class NoCommand extends Command{

	@Override
	public void onTask() {
		System.out.println("NoCommand: on");
	}

	@Override
	public void offTask() {
		System.out.println("NoCommand: off");
	}

}
