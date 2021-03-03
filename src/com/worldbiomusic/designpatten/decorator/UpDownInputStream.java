package com.worldbiomusic.designpatten.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UpDownInputStream extends FilterInputStream {

	private boolean upFlag;

	public UpDownInputStream(InputStream in) {
		super(in);
		this.upFlag = true;
	}

	@Override
	public int read() throws IOException {
		int c = super.read();

		// 대문자로 변경
		if (this.upFlag) {
			c = Character.toUpperCase(c);
		}
		// 소문자로 변경
		else {
			c = Character.toLowerCase(c);
		}

		// upFlag 반전
		this.upFlag = !this.upFlag;
		return c;
	}
}
