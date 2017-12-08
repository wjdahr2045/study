package com.test.variable;

public class OpertorTest {

	public static void main(String[] args) {
		 
		//단항 연산자
		int i=0;// int 형 i변수에 0 초기화
		i++; // ++i, i++
		System.out.println("i="+ i); // i값 출력
		
		i--;// --i, i--
		System.out.println("i-1"+i); // i값 출력
		
		
		
		
		
		//산술연산자
		int x =10, y=2;  //int형 x , y 변수에 정수 10 , 2 값 초기화
		char ch='A'; // char형 ch변수값에 A 문자 초기화
		ch = 65; // ch변수 65 코드값 A 출력
	   
		int sum = x+y; //int 형 변수sum 에 변수 x,y 를 더하고 초기화
		int sub = x-y;//int 형 변수sub 에 변수 x,y 를 빼고 초기화
		int multi = x*y;//int 형 변수multi 에 변수 x,y 를 곱하고 초기화
		float div=x/(y*1.0f);//float 형 변수 div 에 y X 1.0을한뒤 float형으로 변한뒤 x변수 나누기
		int mock = x/y;//int형 변수mock 에 변수 x / y 값 초기화
		int namuji = x % y; //int형 변수 bamuji 에 변수 x/y 한뒤 나머지값
		
		int chSumInt=ch+3; // 변수 ch 값을 3더하고 초기화
		char chSumInt2=(char)chSumInt; //chSumInt 값을 char형으로 변한뒤 초기화
		
		System.out.println("x+y" + sum);// sum값 출력
		System.out.println("x-y" + sub);// sub값 출력
		System.out.println("x*y" + multi);// multi값 출력
		System.out.println("x/y" + div);// div값 출력
		System.out.println("몫:x/y=" + mock);// mock값 출력
		System.out.println("나버지 : " + namuji);// namuji값 출력
		System.out.println("문자형 : char + int = " +chSumInt2);// chSumInt2값 출력
		//1234.56789 의 수에 소수점 세째짜리에서 반올림하시오
		float roundNum=1234.56789f;
		roundNum=((int)((roundNum+0.005f)*100f))/100f;
		
		System.out.println("x > y : " + (x>y));// x , y 를 비교해서 x가높으면 true y가 아니면 false출력
		System.out.println("x >= y : " +(x>=y));// x , y 를 비교해서 x가 높거나같으면true 아니면 false 출력
		System.out.println("x < y : " + (x < y));// x , y 를 비교해서 x가 낮으면 true 아니면false 출력
		System.out.println("x <=y:" + (x<=y));// x , y 를 비교해서 x가 낮거나같으면 true 아니면 false 출력
		System.out.println("x == y : " +(x == y));// x , y 를 비교해서 같으면 ture 아니면 false 출력
		System.out.println("x != y : " + (x!=y));// x , y 를 비교해서 x가 같이안으면 ture 아니면 false 출력
		
		//삼항연산자
		//(조건식) ? A(ture) : B(false)
		int kor = 92; //int 형변수 kor에 정수 92 초기화
		System.out.println("국어점수 레벨 " + ((kor >= 90) ? "A" : "F"));// kor 변수가 90보다 크거나 같으면 A 아니면 F
		
		//논리연산자
		int k =9;//int형 변수 k 에 9초기화
		int l =10;//int형 변수 l 에 10초기화
		
		System.out.println(k>=9 && (l=11)>10);//둘다 true 인 경우 출력 
		System.out.println(l);//출력한 l값 11 출력
		
		l=10;//변수 l 에 10 초기화
		
		System.out.println(k>9 || (l=11)>10); // 둘중 하나가 true 이면 초기화
		System.out.println(l);//출력한 l값 11 출력
		
		//대입연산자
		
		int m=0;// int형 변수 m 에 0 초기화
		m=m+1;//변수 m 에 +1 초기화
		m=m+1;  //m+=1;//변수 m 에 +1 초기화
		m=m+1;//변수 m 에 +1 초기화
		m=m+1;//변수 m 에 +1 초기화
		m=m+1;//변수 m 에 +1 초기화
		System.out.println("m=m+1 : " + m);// m 출력
		

	}

}
