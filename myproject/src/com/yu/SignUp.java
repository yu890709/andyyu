package com.yu;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		System.out.println("�O�_���~(y/N)");
		Scanner in=new Scanner(System.in);
		String line=in.nextLine();
		boolean adutl=line.equals("y")||line.equals("Y");
		if(adutl==true){
			System.out.print("��J�~��:");
			int age=in.nextInt();
			System.out.print("��J�ʦW:");
			String name=in.nextLine();
			System.out.print("��J�ʺ�:");
			String namE=in.nextLine();
			System.out.println("�z����Ʀp�U:\n�~��:"+age+"\n�m�W:"+name+"\n�ʺ�:"+namE);
		}
		else{
			System.out.println("�L�k�ϥ�");
		}

	}

}
