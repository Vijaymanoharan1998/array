package org.str;

public class Matrix {
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int num =1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j]=num;
				num++;
			}
			for (int j= 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.print(a[i][j]);
					
				}
				
			}
			
		}
		
	}

}