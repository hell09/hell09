package com.hell09.test;

public class ThreadDM {

	public static void main(String[] args) {
		System.out.println("开始:--------------");

		int i = 0;
		while (true) {
			i++;
			new Thread(() -> {
//				if (i == 1 || i == 2) {
					System.out.println("----"  + "----");
//				}
			}).start();

			if (i >= 100) {
				break;
			}
		}

		System.out.println("结束:--------------");
	}

}
