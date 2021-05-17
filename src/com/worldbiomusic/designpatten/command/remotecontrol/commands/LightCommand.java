package com.worldbiomusic.designpatten.command.remotecontrol.commands;

import com.worldbiomusic.designpatten.command.remotecontrol.Command;
import com.worldbiomusic.designpatten.command.remotecontrol.product.Light;

public class LightCommand extends Command{
	Light light;

	public LightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void onTask() {
		this.light.lightOn();
	}

	@Override
	public void offTask() {
		this.light.lightOff();
	}
	
	
}
