package com.enums;

public class TestEnum {
	public static void main(String[] args) {
		System.out.println(Season.getComfortableSeason().getDesc());
//		System.out.println(Season.Winter.getComfortableSeason());
		System.out.println(Season.Autumu.getDesc());
	}
}

enum Season{
	Spring("春"),Summer("夏"),Autumu("秋"),Winter("冬");
	private String desc;
	public static Season getComfortableSeason(){
		return Summer;
	}
	
	private Season(String desc) {
		this.setDesc(desc);
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
}
