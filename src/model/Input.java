package model;

import java.util.Scanner;

public abstract class Input {
	private static Scanner read = new Scanner(System.in);

	public static Integer Int(String menssage) {
		System.out.printf(menssage);
		return Integer.parseInt(read.next());
	}

	public static Long Long(String menssage) {
		System.out.printf(menssage);
		return Long.parseLong(read.next());
	}

	public static Character Char(String menssage) {
		System.out.printf(menssage);
		return read.next().charAt(0);
	}

	public static String Str(String menssage) {
		System.out.printf(menssage);
		return read.nextLine();
	}

	public static Float Float(String menssage) {
		System.out.printf(menssage);
		return Float.parseFloat(read.next());
	}

	public static Double Double(String menssage) {
		System.out.printf(menssage);
		return Double.parseDouble(read.next());
	}

	public static Boolean Bool(String menssage) {
		System.out.printf(menssage);
		return Boolean.parseBoolean(read.next());
	}
}
