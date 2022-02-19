package com.keywordandcustomexception;

class CustomException extends Exception {
	public CustomException(String s) {
		super(s);
	}
}

public class MyException {
	public static void main(String args[]) {
		try {
			throw new CustomException("temp");
		} catch (CustomException ex) {
			System.out.println("Caught");
			System.out.println(ex.getMessage());
		}
	}
}
