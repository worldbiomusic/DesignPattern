package com.worldbiomusic.designpatten.command.remotecontrol.commands;

import java.util.Stack;

import com.worldbiomusic.designpatten.command.remotecontrol.Command;
import com.worldbiomusic.designpatten.command.remotecontrol.product.CeilingFan;
import com.worldbiomusic.designpatten.command.remotecontrol.product.CeilingFan.Power;

public class CeilingFanCommand extends Command {
	CeilingFan fan;
	Stack<Power> powerLog;

	public CeilingFanCommand(CeilingFan fan) {
		this.fan = fan;
		this.powerLog = new Stack<CeilingFan.Power>();
	}

	@Override
	protected void onTask() {
		// push powerLog
		this.powerLog.push(this.getPower());

		// on을 계속 클릭하면 단계 순회
		Power nextPower = null;
		switch (fan.getPower()) {
		case OFF:
			nextPower = Power.LOW;
			break;
		case LOW:
			nextPower = Power.MEDIUM;
			break;
		case MEDIUM:
			nextPower = Power.HIGH;
			break;
		case HIGH:
			nextPower = Power.LOW;
			break;
		}
		// set power
		this.fan.setPower(nextPower);

		// msg
		this.notifyChanged(nextPower);

	}

	@Override
	protected void offTask() {
		// push powerLog
		this.powerLog.push(this.getPower());

		// 전원 OFF
		// set power
		this.fan.setPower(Power.OFF);

		// msg
		this.notifyChanged(Power.OFF);
	}

	@Override
	public void undo() {
		System.out.println("[UNDO]");
		// 단계도 log로 기록하고 다시 복원하기 떄문에 override
		Power prevPower = this.powerLog.pop();
		this.fan.setPower(prevPower);
		this.notifyChanged(prevPower);
	}

	private void notifyChanged(Power power) {
		System.out.println("Fan power set to : " + power.name());
	}

	private Power getPower() {
		return this.fan.getPower();
	}

}
