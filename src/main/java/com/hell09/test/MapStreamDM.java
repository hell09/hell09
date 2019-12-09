package com.hell09.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapStreamDM {

	public static void main(String[] args) {
		Person p1 = new Person(2l, "22");
		Person p2 = new Person(1l, "11");
		Person p3 = new Person(3l, "33");
		List<Person> list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		System.out.println("1111---" + list);
		
		Map<Long, Person> map = list.stream().collect(Collectors.toMap(Person::getId, Function.identity()));
		System.out.println("2222---" + map);
		System.out.println("2222zz---" + map.values());
		
		Map<Long, Person> omap = new LinkedHashMap<>();
		map.entrySet().stream().sorted(Map.Entry.comparingByKey((a, b)-> Long.compare(b,  a))).forEachOrdered(o->omap.put(o.getKey(), o.getValue()));
		System.out.println("3333---" + omap);
		System.out.println("3333zz---" + omap.values());
		
		Map<Long, Person> omap2 = new LinkedHashMap<>();
		list.stream().sorted(Comparator.comparing(Person::getId).reversed()).forEachOrdered(o->omap2.put(o.id, o));
		System.out.println("3333---" + omap2);
		System.out.println("3333zz---" + omap2.values());

//		Map<Long, Person> omap4 = new LinkedHashMap<>();
//		list.stream().forEachOrdered(o->omap4.put(o.id, o));
		Map<Long, Person> omap4 = new HashMap<>();
		list.stream().forEach(o->omap4.put(o.id, o));
		System.out.println("4444---" + omap4);
		System.out.println("4444zz---" + omap4.values());
		
		

	}

	
}
