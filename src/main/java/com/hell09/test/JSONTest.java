package com.hell09.test;

import com.alibaba.fastjson.JSON;

public class JSONTest {

	public static void main(String[] args) {
		JSONTest test = new JSONTest();
		People p1 = test.new People(2l, "22", 22);
		People p2 = test.new People(3l, "33", 33);
		People p3 = test.new People(4l, "44", 44);
		
		System.out.println(p1);
		System.out.println(JSON.toJSONString(p1));
		
		
	}

	class People {
		private Long id;
		private String name;
		private Integer age;

		public People() {
			super();
		}

		public People(Long id, String name, Integer age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
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

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

	}
}
