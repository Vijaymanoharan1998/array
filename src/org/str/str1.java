package org.str;

import java.util.Scanner;

public class str1 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String b=a.nextLine();
		int uppercount=0,lowercount=0,numbercount=0,specialcount=0;
		
		for (int i = 0; i < b.length(); i++) {
			char c = b.charAt(i);
			if(Character.isUpperCase(c)) {
				uppercount++;
			}
			else if(Character.isLowerCase(c)){
				lowercount++;
			}
			else if(Character.isDigit(c)) {
				numbercount++;
			}
			else {
				specialcount++;
			}
		}
		System.out.println("UPPERCOUNT:"+uppercount);
		System.out.println("LOWERCOUNT:"+lowercount);
		System.out.println("NUMBERCOUNT:"+numbercount);
		System.out.println("SPECIALCOUNT:"+specialcount);
	}

}
