package com.hell09.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class IoDM {

	public static void main(String[] args) {
		
		while (true) {
			systemInAndOutTest();
		}
		
		
	}

	private static void systemInAndOutTest() {
		int i = 0;
		InputStream in = System.in;
		OutputStream os = System.out;

		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String inputStr;
		try {
			inputStr = br.readLine();
			os.write(inputStr.getBytes());
			System.out.println();
			System.out.println(i++ + " ------" + System.lineSeparator());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
