package com.hei.tank;

import java.util.Random;

public class Tank implements Moveable {
	public void move(){
		System.out.println("Tank moving...");
		try {
			Thread.sleep(new Random().nextInt(10000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
