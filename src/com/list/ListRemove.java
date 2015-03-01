package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListRemove {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("tq");
		list.add("ss");
		list.add("shu");
		ListIterator<String> listIterator = list.listIterator();
		listIterator.next();
		listIterator.add("list");
		listIterator.previous();
		listIterator.remove();
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println(list.toString());
		System.out.println(listIterator.nextIndex());
		System.out.println(listIterator.previousIndex());
	}
}
