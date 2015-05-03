package com.json;

import java.util.Date;

import net.sf.json.JSONObject;

public class JsonFormat {
	public static void main(String[] args) {
		Person p =new Person();
		p.setBirthday(new Date());
		p.setName("ss");
		String str = JSONObject.fromObject(p).toString();
		Person pp = (Person) JSONObject.toBean(JSONObject.fromObject(str), Person.class);
		System.err.println(pp.getName());
		System.err.println(pp.getBirthday());
	}
}
