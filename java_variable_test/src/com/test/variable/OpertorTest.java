package com.test.variable;

public class OpertorTest {

	public static void main(String[] args) {
		 
		//���� ������
		int i=0;// int �� i������ 0 �ʱ�ȭ
		i++; // ++i, i++
		System.out.println("i="+ i); // i�� ���
		
		i--;// --i, i--
		System.out.println("i-1"+i); // i�� ���
		
		
		
		
		
		//���������
		int x =10, y=2;  //int�� x , y ������ ���� 10 , 2 �� �ʱ�ȭ
		char ch='A'; // char�� ch�������� A ���� �ʱ�ȭ
		ch = 65; // ch���� 65 �ڵ尪 A ���
	   
		int sum = x+y; //int �� ����sum �� ���� x,y �� ���ϰ� �ʱ�ȭ
		int sub = x-y;//int �� ����sub �� ���� x,y �� ���� �ʱ�ȭ
		int multi = x*y;//int �� ����multi �� ���� x,y �� ���ϰ� �ʱ�ȭ
		float div=x/(y*1.0f);//float �� ���� div �� y X 1.0���ѵ� float������ ���ѵ� x���� ������
		int mock = x/y;//int�� ����mock �� ���� x / y �� �ʱ�ȭ
		int namuji = x % y; //int�� ���� bamuji �� ���� x/y �ѵ� ��������
		
		int chSumInt=ch+3; // ���� ch ���� 3���ϰ� �ʱ�ȭ
		char chSumInt2=(char)chSumInt; //chSumInt ���� char������ ���ѵ� �ʱ�ȭ
		
		System.out.println("x+y" + sum);// sum�� ���
		System.out.println("x-y" + sub);// sub�� ���
		System.out.println("x*y" + multi);// multi�� ���
		System.out.println("x/y" + div);// div�� ���
		System.out.println("��:x/y=" + mock);// mock�� ���
		System.out.println("������ : " + namuji);// namuji�� ���
		System.out.println("������ : char + int = " +chSumInt2);// chSumInt2�� ���
		//1234.56789 �� ���� �Ҽ��� ��°¥������ �ݿø��Ͻÿ�
		float roundNum=1234.56789f;
		roundNum=((int)((roundNum+0.005f)*100f))/100f;
		
		System.out.println("x > y : " + (x>y));// x , y �� ���ؼ� x�������� true y�� �ƴϸ� false���
		System.out.println("x >= y : " +(x>=y));// x , y �� ���ؼ� x�� ���ų�������true �ƴϸ� false ���
		System.out.println("x < y : " + (x < y));// x , y �� ���ؼ� x�� ������ true �ƴϸ�false ���
		System.out.println("x <=y:" + (x<=y));// x , y �� ���ؼ� x�� ���ų������� true �ƴϸ� false ���
		System.out.println("x == y : " +(x == y));// x , y �� ���ؼ� ������ ture �ƴϸ� false ���
		System.out.println("x != y : " + (x!=y));// x , y �� ���ؼ� x�� ���̾����� ture �ƴϸ� false ���
		
		//���׿�����
		//(���ǽ�) ? A(ture) : B(false)
		int kor = 92; //int ������ kor�� ���� 92 �ʱ�ȭ
		System.out.println("�������� ���� " + ((kor >= 90) ? "A" : "F"));// kor ������ 90���� ũ�ų� ������ A �ƴϸ� F
		
		//��������
		int k =9;//int�� ���� k �� 9�ʱ�ȭ
		int l =10;//int�� ���� l �� 10�ʱ�ȭ
		
		System.out.println(k>=9 && (l=11)>10);//�Ѵ� true �� ��� ��� 
		System.out.println(l);//����� l�� 11 ���
		
		l=10;//���� l �� 10 �ʱ�ȭ
		
		System.out.println(k>9 || (l=11)>10); // ���� �ϳ��� true �̸� �ʱ�ȭ
		System.out.println(l);//����� l�� 11 ���
		
		//���Կ�����
		
		int m=0;// int�� ���� m �� 0 �ʱ�ȭ
		m=m+1;//���� m �� +1 �ʱ�ȭ
		m=m+1;  //m+=1;//���� m �� +1 �ʱ�ȭ
		m=m+1;//���� m �� +1 �ʱ�ȭ
		m=m+1;//���� m �� +1 �ʱ�ȭ
		m=m+1;//���� m �� +1 �ʱ�ȭ
		System.out.println("m=m+1 : " + m);// m ���
		

	}

}
