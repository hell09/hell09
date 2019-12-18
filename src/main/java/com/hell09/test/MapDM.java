package com.hell09.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;


public class MapDM {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("a", 2);
		m.put("b", 3);
		System.out.println(m);
		System.out.println(m.get("a"));
		System.out.println(m.get("c"));
		
		
		Map<Integer, Integer>  mm = new HashMap<>();
		mm.put(1, 1);
		mm.put(11, 11);
		mm.put(2, 2);
		mm.put(5, 2);
		mm.put(3, 2);
		System.out.println("555: " + mm.get(5));
		
		System.out.println("原始数据: " + mm);
		System.out.println("原始数据values: " + mm.values());
		System.out.println("删除不存在key: " + mm.remove(4444444));
		
		
		List<Long> ll = Lists.newArrayList();
		List<Long> ll0 = null;
		for (Long l : ll ) {
			System.out.println("000 " + l);
		}
		for (Long l : ll0 ) {
			System.out.println("111 " + l);
		}
		
		
		
		
//		IdentityHashMap<Comparable, Comparable> mm = new IdentityHashMap<Comparable, Comparable>();
//		mm.put(2, 2222);
//		mm.put(new Integer(2), 22222);
//		
//		mm.put("2", "22");
//		mm.put(new String("2"), "221");
//		
//		
//		System.out.println(mm.get(2));
//		System.out.println(mm.get("2"));
//		System.out.println(mm.get(new String("2")));
		
		String[] words = new String[] { "Hello", "World" };
//		List<String[]> a = Arrays.stream(words).map(word -> word.split("")).distinct().collect(Collectors.toList());
//		a.forEach(System.out::print);
//		List<String> a = Arrays.stream(words).map(word -> word.split("")).flatMap(Arrays::stream).distinct()
//		        .collect(Collectors.toList());
//		a.forEach(System.out::print);

//		System.out.println(UUID.randomUUID());
//		System.out.println(UUID.randomUUID());
		
		
	}

}
