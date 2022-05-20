package org.str;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arr {
	public static void main(String[] args) {
		List l= new ArrayList<Integer>();
		l.add(20);
		l.add(50);
		l.add(50);
		l.add(60);
		l.add(70);
		
		System.out.println(l.size());
		System.out.println(l);
		
//		l.add(20);
//		l.remove(true);
//		l.set(4, 50);
//		l.add(2,40);
		
		
		List <Integer>l1= new ArrayList<Integer>();
		l1.add(20);
		l1.add(40);
		l1.add(60);
		l1.add(60);
		System.out.println(l1);
		l.addAll(l1);
		System.out.println(l);
		
		Integer c =  (Integer) Collections.min(l);
		System.out.println(c);
		
		Collections.sort(l);
		System.out.println(l);
		
		Collections.reverse(l);
		System.out.println(l);
		
		l.add(20);
		System.out.println(l);
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
	}

}
