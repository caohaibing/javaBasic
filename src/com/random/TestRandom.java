package com.random;

import java.util.Random;

public class TestRandom {
	public static void main(String[] args) {
		Random r = new Random(1000);
		for (int i = 0; i < 4; i++) {
			System.out.println("第" + i + "---" + r.nextInt());
			
		}
	}

}
