// author: HoangTQ11

package com.vn;

import com.vn.controller.Caculator;

public class Main {
	public static void main(String[] args) {
		//phep toan voi so nguyen 
		
		Caculator caculator = new Caculator();
		caculator.setA(3);
		caculator.setB(2);
		caculator.setC("+");
		float result = caculator.caculator();
		System.out.println(result);
	
	}
}
