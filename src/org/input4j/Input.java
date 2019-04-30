package org.input4j;

import java.util.Scanner;

public abstract class Input {
	private static Scanner read = new Scanner(System.in);

	public static Integer Int(String menssage) {
		System.out.printf(menssage);
		Integer i = Integer.parseInt(read.next());
		return i;
	}

	public static Long Long(String menssage) {
		System.out.printf(menssage);
		Long l = Long.parseLong(read.next());
		return l;
	}

	public static Character Char(String menssage) {
		System.out.printf(menssage);
		Character c = read.next().charAt(0);
		return c;
	}

	//Impossivel utilizar o mesmo objeto dos outros inputs
	public static String Str(String menssage) {
		Scanner rr = new Scanner(System.in);
		System.out.printf(menssage);
		String s = rr.next();
		
		if(rr.hasNextLine()) {
			s += rr.nextLine();
		}
		
		return s;
	}

	public static Float Float(String menssage) {
		System.out.printf(menssage);
		Float v = Float.parseFloat(read.next());
		return v;
	}

	public static Double Double(String menssage) {
		System.out.printf(menssage);
		Double d = Double.parseDouble(read.next());
		return d;
	}

	public static Boolean Bool(String menssage) {
		System.out.printf(menssage);
		Boolean b = Boolean.parseBoolean(read.next());
		return b;
	}
}
