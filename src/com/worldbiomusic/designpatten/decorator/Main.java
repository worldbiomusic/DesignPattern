package com.worldbiomusic.designpatten.decorator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.worldbiomusic.designpatten.decorator.starbuz.Beverage;
import com.worldbiomusic.designpatten.decorator.starbuz.beverage.HouseBlend;
import com.worldbiomusic.designpatten.decorator.starbuz.beverage.Latte;
import com.worldbiomusic.designpatten.decorator.starbuz.condiment.Mocha;
import com.worldbiomusic.designpatten.decorator.starbuz.condiment.Perl;
import com.worldbiomusic.designpatten.decorator.starbuz.condiment.Whip;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.orderBeverage();
		System.out.println("----------------------------");
		main.readUpDownStream();
	}
	
	void orderBeverage() {
		Beverage hb = new Perl(new Whip(new HouseBlend()));
		System.out.println(hb.getDescription());
		System.out.println("Cost: " + hb.cost());

		Beverage latte = new Mocha(new Whip(new Latte()));
		System.out.println(latte.getDescription());
		System.out.println("Cost: " + latte.cost());
	}

	void readUpDownStream() {
		try {
			InputStream inputStream = new UpDownInputStream(new BufferedInputStream(
					new FileInputStream(new File(getClass().getResource("test.txt").getPath()))));
			int c;
			while ((c = inputStream.read()) != -1) {
				System.out.print((char) c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
