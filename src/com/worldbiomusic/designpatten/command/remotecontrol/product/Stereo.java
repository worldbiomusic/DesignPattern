package com.worldbiomusic.designpatten.command.remotecontrol.product;

public class Stereo {
	public void on() {
		System.out.println("Stereo ON");
	}

	public void off() {
		System.out.println("Stereo OFF");
	}

	public void setCD() {
		System.out.println("CD set");
	}

	public void setVolume(int size) {
		System.out.println("Volume size set to " + size);
	}
}
