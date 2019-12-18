package com.hell09.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.util.Strings;


public class SplitDM {

	public static void main(String[] args) {
		String str = "85901789935\n" + 
				"15901789935 05901789935 \n"; 
		String str1 = "85901789935\n 15901789935 05901789935 \n";
		
		String str2 = "中国;美国；+;;人民；;";
//		String str2 = "中国;美国；+;;；人民；;";
//		String str2 = ";；；;";
		
		String[] split = str2.split(";+|；+");
//		String[] split = str1.split("\\s+");
//		String[] split = str.split("\\s+ | \\n");
//		List<String> phones = new ArrayList(split);
//		List<String> phones1 = Lists.newArrayList(str1.split("\\s+|\\n"));
//		List<String> phones2 = Lists.newArrayList(str2.split("\\s+|\\n"));
		
		for (String s : split) {
			System.out.println("---> " + s);		
//			System.out.println(Strings.isEmpty(s));
		}
		System.out.println(split.length);		
		
	}

}
