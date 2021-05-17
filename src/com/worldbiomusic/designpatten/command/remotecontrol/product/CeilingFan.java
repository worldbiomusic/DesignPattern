package com.worldbiomusic.designpatten.command.remotecontrol.product;

public class CeilingFan {
	public enum Power {
		OFF, LOW, MEDIUM, HIGH;
	}

	private Power power;

	public CeilingFan() {
		this.power = Power.OFF;
	}

	public void setPower(Power power) {
		this.power = power;
	}

	public Power getPower() {
		return this.power;
	}
}
