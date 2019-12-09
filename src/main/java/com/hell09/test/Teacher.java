package com.hell09.test;

public class Teacher extends Person {
	/**
	 * 父类中存在serial (serialVersionUID), 子类中可以没有 serialVersionUID。
	 */
	
	String post;

	public Teacher() {
		super();
	}

	public Teacher(String post) {
		super();
		this.post = post;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public static void main(String[] args) {

		Teacher t = new Teacher();
		
		
		System.out.println(t.getId());
		System.out.println(t.name);
		
	}

}
