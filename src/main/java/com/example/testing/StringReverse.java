package com.example.testing;

public class StringReverse {

	public static void main(String[] args) {
		
		String str="Welcome";
		
		for(int i=str.length()-1;i>=0;i--) {
			
			System.out.print(str.charAt(i)+" ");
		}

	}

}
