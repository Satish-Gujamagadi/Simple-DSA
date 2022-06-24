package com.Test;

public class Fibonacy {
	
	public static void main(String[] args) {
		int a = 0,b = 1;
		int c;
		
		for (int j = 0; j < 10; j++) {
		
		c = a+b;
		System.out.print(" "+a);
			a = b;
			b = c;
			
		}
		
	}

}
