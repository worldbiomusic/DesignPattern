package com.worldbiomusic.designpatten.command.remotecontrol.commands;

import com.worldbiomusic.designpatten.command.remotecontrol.Command;
import com.worldbiomusic.designpatten.command.remotecontrol.product.Garage;

public class GarageCommand extends Command {

	Garage garage;

	public GarageCommand(Garage garage) {
		this.garage = garage;
	}

	@Override
	protected void onTask() {
		this.garage.up();
	}

	@Override
	protected void offTask() {
		this.garage.down();
	}

}
