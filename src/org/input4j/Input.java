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

	public static String Str(String menssage) {
		System.out.printf(menssage);
		
		//Corrige erro de pular leitura
		if(read.hasNext()) {
			read.nextLine();
		}
		
		String s = read.nextLine();
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
