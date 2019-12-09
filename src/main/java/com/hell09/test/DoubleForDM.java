package com.hell09.test;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

public class DoubleForDM {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		List<Integer> nums = Lists.newArrayList(1, 2, 3);
		list.add(new Person(1l, "111", nums));
		list.add(new Person(2l, "222", nums));
		list.add(new Person(3l, "333", nums));

		quit: for (Person p : list) {
			for (int n : p.getNums()) {
				System.err.println(n);
				if (p.getId() == 2 && n == 2) {
//					break;
					
//					return;
					
					break quit;
				}
			}
		}
		System.out.println("出来了！！!");
		
		
	}

}
