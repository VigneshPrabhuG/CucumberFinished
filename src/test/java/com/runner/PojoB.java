package com.runner;

import com.baseclass.PojoA;

public class PojoB {
	
	public static void main(String[] args) {
		
		PojoA num =new PojoA();
		int s = num.getS();
		System.out.println(s);
		num.setS(23);
		int s2 = num.getS();
		System.out.println(s2);
		
		
		
	}

}
