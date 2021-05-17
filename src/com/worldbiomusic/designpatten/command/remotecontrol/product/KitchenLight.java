package com.worldbiomusic.designpatten.command.remotecontrol.product;

public class KitchenLight implements Light {
	public void lightOn() {
		System.out.println("KitchenLight ON");
	}

	public void lightOff() {
		System.out.println("KitchenLight OFF");
	}
}