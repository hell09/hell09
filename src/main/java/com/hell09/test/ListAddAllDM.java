package com.hell09.test;

import java.util.List;

import com.google.common.collect.Lists;

public class ListAddAllDM {

	public static void main(String[] args) {
		
		List<String> ll = Lists.newArrayList();
		List<String> ll0 = Lists.newArrayList();
		ll.add("1");
		ll.add("2");
		
		System.out.println(ll);
		System.out.println(ll0);
		ll.addAll(ll0);
		System.out.println(ll0);
	}

}
