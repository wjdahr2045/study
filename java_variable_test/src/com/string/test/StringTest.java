package com.string.test;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class StringTest {

	public static void main(String[] args) {
		
		String msg="�ݰ����ϴ�.";
		System.out.println(msg);
		System.out.println("���ڿ����� : " + msg.length());
		System.out.println("���ڿ��� : " + msg.equals("�ٹٹ�"));
		System.out.println("����Ž�� : "+ msg.contains("�ݰ�"));
		System.out.println("�� �ε��� ��ȯ" + msg.indexOf("�ϴ�"));
		System.out.println("index�� ���� ��ȯ : " +msg.charAt(2));// �ε��� ���� ��ȯ
		System.out.println("���ڿ� Ȯ�� : " + msg.isEmpty()); //�� ���ڿ� Ȯ��
		System.out.println("���ڿ� ��ü : " + msg.replace("�ݰ���", "������"));// ���ڿ� ��ü
		System.out.println("���ڿ� �߶󳻱� : " + msg.substring(0,3));//0����3�������� �߶󳽰� ���
		System.out.println("�빮�� ��ȯ : "+ msg.toUpperCase());
		System.out.println("�ҹ��� ��ȯ : "+ msg.toLowerCase());
		
		boolean isNumber=true;//is = �����̳�
		msg="";
		for(int index=0; index<msg.length();index++){
			System.out.println(msg.charAt(index));
			char ch=msg.charAt(index);
			if(!(ch>=48 && ch<=57)){
				isNumber=false;
			}
			
		}
		
		System.out.println(isNumber?"����":"���ڰ��ƴ�");
	}

}
