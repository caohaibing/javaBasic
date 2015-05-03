package com.testJVM;

import java.util.ArrayList;

public class StudyJVM {
	public static void main(String[] args) {
		//oom();
		//stackOf();
		System.err.println("testMian");
	}

	private static void stackOf() {
		double s;
		stackOf();
	}

	private static void oom() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(true){
			list.add(1);
		}
	}
	
	
}
