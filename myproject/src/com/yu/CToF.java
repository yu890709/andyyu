package com.yu;

import java.util.Scanner;

public class CToF {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("��ܭn���⪺�ū�(1.��� 2.�ؤ� 3.�ͤ�): ");
		int a=in.nextInt();
		TempChange temp=new TempChange(a);
		temp.input();
		switch(a){
		case 1:
			System.out.printf("%.1f C = %.1f F\n%.1f C = %.1f K",temp.celsius,temp.fah(),temp.celsius,temp.kel());
			break;
		case 2:
			System.out.printf("%.1f F = %.1f C\n%.1f F = %.1f K",temp.fahrenheit,temp.cel(),temp.fahrenheit,temp.kel());
			break;
		case 3:
			System.out.printf("%.1f K = %.1f C\n%.1f K = %.1f F",temp.kelvin,temp.cel(),temp.kelvin,temp.fah());
			break;
		}
	}

}
