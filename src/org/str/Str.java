package org.str;

import java.util.Scanner;

public class Str {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String b = s.nextLine();
		int lettercount=0,numbercount = 0;
		
		for (int i = 0; i <b.length(); i++) {
			char c = b.charAt(i);
			if(Character.isAlphabetic(c)) {
				lettercount++;
			}
			else {
				numbercount++;
			}
		}
		if(lettercount==0) {
			System.out.println("valid number");
		}
		else {
			System.out.println("invalid number");
		}
	}

}
