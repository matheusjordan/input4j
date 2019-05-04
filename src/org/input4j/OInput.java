package org.input4j;

import java.util.Scanner;

public class OInput {
	private static Scanner read = new Scanner(System.in);
	
	public int Int(String menssage) {
		System.out.printf(menssage);
		Integer i = Integer.parseInt(read.next());
		return i;
	}

	public long Lng(String menssage) {
		System.out.printf(menssage);
		Long l = Long.parseLong(read.next());
		return l;
	}

	public char Chr(String menssage) {
		System.out.printf(menssage);
		Character c = read.next().charAt(0);
		return c;
	}

	//Impossivel utilizar o mesmo objeto dos outros inputs
	public String Str(String menssage) {
		Scanner read = new Scanner(System.in);
		System.out.printf(menssage);
		String s = read.next();
		
		if(read.hasNextLine()) {
			s += read.nextLine();
		}
		
		return s;
	}

	public float Flt(String menssage) {
		System.out.printf(menssage);
		Float v = Float.parseFloat(read.next());
		return v;
	}

	public double Dob(String menssage) {
		System.out.printf(menssage);
		Double d = Double.parseDouble(read.next());
		return d;
	}

	public boolean Bool(String menssage) {
		System.out.printf(menssage);
		Boolean b = Boolean.parseBoolean(read.next());
		return b;
	}
}