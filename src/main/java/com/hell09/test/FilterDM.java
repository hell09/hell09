package com.hell09.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDM {

	public static void main(String[] args) {
		List<Long> dd = new ArrayList<>();
		dd.add(1l);
		dd.add(2l);
		dd.add(3l);

		List<Long> result = dd.stream().filter(d -> d != 2).collect(Collectors.toList());

		System.out.println(result);
	}

}
