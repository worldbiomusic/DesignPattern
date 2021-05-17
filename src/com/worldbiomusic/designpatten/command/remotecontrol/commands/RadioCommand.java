package com.worldbiomusic.designpatten.command.remotecontrol.commands;

import com.worldbiomusic.designpatten.command.remotecontrol.Command;
import com.worldbiomusic.designpatten.command.remotecontrol.product.Stereo;

public class RadioCommand extends Command {

	Stereo stereo;

	public RadioCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	@Override
	protected void onTask() {
		this.stereo.on();
		this.stereo.setCD();
		this.stereo.setVolume(11);
	}

	@Override
	protected void offTask() {
		this.stereo.off();
	}

}
