package com.andy;

import java.util.Scanner;

public class NameAge {

	public static void main(String[] args) {
		String[] name=new String[]{"���@","�L�G","�i�T","���|","����"};
		int[] age=new int[]{56,45,51,48,35};
		System.out.print("��ܫ��~�ֱƧǤ�k�A�п�J1��2(1.���W 2.����):"); 
		Scanner in=new Scanner(System.in);
		int c,t=0;
		do{
			c=in.nextInt();
			if(c==1||c==0){
				if(c==1){
					for(int i=0;i<age.length-1;i++){
						
					}
				}
				else{
					
				}
			}
			else{
				System.out.print("��J���~�A�Э��s��J1��2(1.���W 2.����):");
			}
		}while(c!=1||c!=0);
	}

}
