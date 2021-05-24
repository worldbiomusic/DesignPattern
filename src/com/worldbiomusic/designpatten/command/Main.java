package com.worldbiomusic.designpatten.command;

import com.worldbiomusic.designpatten.command.remotecontrol.RemoteControl;
import com.worldbiomusic.designpatten.command.remotecontrol.commands.CeilingFanCommand;
import com.worldbiomusic.designpatten.command.remotecontrol.commands.LightCommand;
import com.worldbiomusic.designpatten.command.remotecontrol.commands.MacroCommand;
import com.worldbiomusic.designpatten.command.remotecontrol.product.CeilingFan;
import com.worldbiomusic.designpatten.command.remotecontrol.product.KitchenLight;
import com.worldbiomusic.designpatten.command.remotecontrol.product.Light;
import com.worldbiomusic.designpatten.command.remotecontrol.product.LivingLight;

public class Main {
	public static void main(String[] args) {
		// Reciever(실제 기능 수행 제품)
		Light kitchenL = new KitchenLight();
		Light livingL = new LivingLight();
		CeilingFan fan = new CeilingFan();

		// Command(명령 중계자(인터페이스 역할))
		LightCommand kitchenLCommand = new LightCommand(kitchenL);
		LightCommand livingLCommand = new LightCommand(livingL);
		CeilingFanCommand fanCommand = new CeilingFanCommand(fan);
		MacroCommand macroCommand = new MacroCommand(kitchenLCommand, livingLCommand, fanCommand);

		// Invoker(실행자)
		RemoteControl c = new RemoteControl();
		c.addCommand(0, kitchenLCommand);
		c.addCommand(1, livingLCommand);
		c.addCommand(2, fanCommand);
		c.addCommand(3, macroCommand);
		
		// Invoker로 명령 실행(MacroCommand + 여러개)
		c.on(3);
		c.on(2);
		c.on(1);
		c.undo();
		c.undo();
		c.undo();
		

		// Invoker로 명령 실행(CeilingFan)
//		c.on(2);
//		c.on(2);
//		c.on(2);
//		c.undo();
//		c.undo();
//		c.on(2);
//		c.off(2);

		// Invoker로 명령 실행(Light)
//		c.on(0);
//		c.on(1);
//		c.undo();
//		c.undo();

	}
}
