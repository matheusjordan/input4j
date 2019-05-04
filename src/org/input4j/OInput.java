package org.input4j;

import java.util.Scanner;

public class OInput {
	private static Scanner read = new Scanner(System.in);
	
	public int Int(String menssage) {
		System.out.printf(menssage);
		Integer i = Integer.parseInt(read.next());
		int value = i.intValue();
		return value;
	}

	public long Lng(String menssage) {
		System.out.printf(menssage);
		Long l = Long.parseLong(read.next());
		long value = l.longValue();
		return value;
	}

	public char Chr(String menssage) {
		System.out.printf(menssage);
		Character c = read.next().charAt(0);
		char value = c.charValue();
		return value;
	}

	//Impossivel utilizar o mesmo objeto dos outros inputs
	public String Str(String menssage) {
		Scanner read = new Scanner(System.in);
		System.out.printf(menssage);
		StringBuilder s = new StringBuilder(read.next());
		
		if(read.hasNextLine()) {
			s.append(read.nextLine());
		}
		String value = s.toString();
		return value;
	}

	public float Flt(String menssage) {
		System.out.printf(menssage);
		Float f = Float.parseFloat(read.next());
		float value = f.floatValue();
		return value;
	}

	public double Dob(String menssage) {
		System.out.printf(menssage);
		Double d = Double.parseDouble(read.next());
		double value = d.doubleValue();
		return value;
	}

	public boolean Bool(String menssage) {
		System.out.printf(menssage);
		Boolean b = Boolean.parseBoolean(read.next());
		boolean value = b.booleanValue();
		return value;
	}
}