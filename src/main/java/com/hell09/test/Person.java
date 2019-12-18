package com.hell09.test;

import java.io.Serializable;
import java.util.List;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	
//	private Long id;	// 会报错
	Long id;
	String name;
	List<Integer> nums;

	public Person() {
		super();
	}

	public Person(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Person(Long id, String name, List<Integer> nums) {
		super();
		this.id = id;
		this.name = name;
		this.nums = nums;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Integer> getNums() {
		return nums;
	}

	public void setNums(List<Integer> nums) {
		this.nums = nums;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", nums=" + nums + "]";
	}

//	public static void main(String[] args) {
//		Person p = new Person();
//		
//		System.out.println(p + " " + p.hashCode());
//		p = new Person();
//		System.out.println(p + " " + p.hashCode());
//		
//		
//		
//	}
	
}
