package com.worldbiomusic.designpatten.command.remotecontrol;

import java.util.Stack;

public abstract class Command {
	// 기록저장
	// true: ON, false: OFF
	private Stack<Boolean> actionLog;

	public Command() {
		this.actionLog = new Stack<Boolean>();
	}

	public void on() {
		// this.actionLog.push(true); 코드를 강제하기 위해 다른 메소드(onTask())로 구현하게 만듬
		this.onTask();
		this.actionLog.push(true);
	}

	public void off() {
		this.offTask();
		this.actionLog.push(false);
	}

	protected abstract void onTask();

	protected abstract void offTask();

	public void undo() {
		System.out.println("[UNDO]");
		if (!this.actionLog.isEmpty()) {
			boolean action = this.actionLog.pop();
			if (action) {
				// on() 였을 때
				this.off();
			} else {
				// off() 였을 때
				this.on();
			}
		} else {
			System.out.println("actionLog is empty");
		}
	}
}
