package com.vn.controller;

public class Caculator {
	private int a;
	private int b;
	private String c;

	public float caculator() {
		switch (c) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		default:
			return a / b;
		}
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

}
