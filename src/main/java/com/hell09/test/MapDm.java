package com.hell09.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class MapDm {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("a", 2);
		m.put("b", 3);
		System.out.println(m.get("a"));
		System.out.println(m.get("c"));
		
		
		
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
