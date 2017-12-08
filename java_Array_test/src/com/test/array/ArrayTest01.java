package com.test.array;

public class ArrayTest01 {
	int x=30; //메모리 영역이 달라 변수x 중복
	
	
	{
		int x=111111111; //int 형 변수 x 111111 초기화
		//int x;    // 변수 x 중복
		System.out.println(x);//같은 영역부터 출력 
		// 같은영역안에 업을때 밖에영역부터 출력
		{
			//int x;      // 변수 x 중복
			int y;   //변수 y
			{
				//int x;       // 변수 x 중복
			}
		}
		
		{
			int y; //변수 y
			
		}
	}

	public static void main(String[] args) {
		//1차원 배열 (행)
		int[] intArray = new int[5];// int 타입 배열을만듬
		intArray[0]=1;// 0행에 1 초기화
		intArray[1]=2;// 0행에 2 초기화
		intArray[2]=3;// 0행에 3 초기화
		intArray[3]=4;// 0행에 4 초기화
		intArray[4]=5;// 0행에 5 초기화
		
		int[] intArray2 ={1,2,3,4,5};   // 적은 데이터는 적당한방법  5개의행이있는배열
		
		int[] intArray3 = new int[]{1,2,3,4,5}; // 새로운 배열을 할당할때 // 5개의 행이있는배열
		
		intArray = new int[]{1,2,3,4,5,6,7,8,9,10}; // 10개 행이있는 배열
		// 새로 정의 할떄 ( 만든것을 다시할때)
		int[] intArray4 = new int[100]; //int 형 intArray4 100행 생성?
		for(int index =0;index<intArray4.length;index++){//indes변수를 0부터 intArray4보다 클떄까지 index를 1씩더해라
			intArray4[index]=index+1; // index 변수에 +1
		}for(int index =0;index<intArray4.length;index++){//indes변수를 0부터 intArray4보다 클떄까지 index를 1씩더해라
				System.out.print(intArray4[index]+
						(intArray4[index]% 10 != 0 ? ",":"\n")); //intArray4[index]가 10을나눠서 나머지0이 안나올때 ,출력 아니면 줄바꿈
				//\n 줄바꿈(new) 
				
				}
		//2차원 배열 (행 x 열 )-> 배열안에배열
		int[][]intArrays = new int [3]/*행*/[3];//열 // 3행3열 배열만듬
		int[][] intArrays2={
				            {1,2,3},
				            {4,5,6},
				            {7,8,9}
		                    };//3행 3열 배열을만듬
		
		
		int[][]scoreTable ={
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};                    //3행 3열 배열을만듬
		int total =0;//int 형 변수total 0 초기화
		
		//length 길이
		for(int row =0;row<scoreTable.length;row++){    //행 반복문
			total=0;//행이 반복될때 변수 초기화
			for(int col =0;col<scoreTable[row].length;col++){//열 반복문
				total+=scoreTable[row][col];//열이 반복될때 변수누적
			}
			
			
			
			System.out.println((row+1)+"반학생평균:"+(total*1f/scoreTable[row].length));/* 반학생 평균 :total나누기 scoreTable[row]
			                                                                             의 문자열 길이만큼 후 출력*/ 
		} // 평균 출력
		int kortotal1 = 0;   // int 변수선언		
		int engtotal1 = 0;   // int 변수선언
		int mathtotal1 = 0;  // int 변수선언
		
		for(int row=0;row<scoreTable.length;row++){// row는 0부터 row가 scoreTable문자열 길이보다 클떄까지 row 1씩더헤라
			for(int col=0;col<scoreTable[col].length;col++){//col은 0부터 col 이scoreTable[col]보다 클떄까지 col을 1씩더해라 
				kortotal1+= scoreTable[row][0];//row 행에 있는값음 kortotal1변수에 더한다
				engtotal1+= scoreTable[row][1];//row 행에 있는값음 kortotal1변수에 누적시킨다
				mathtotal1+= scoreTable[row][2];//row 행에 있는값음 kortotal1변수에 누적시킨다
			}
			System.out.println("전체 학생의 국어평균 :" +kortotal1/3f);// kortotal1변수 /3
			System.out.println("전체 학생의 영어평균 :" +engtotal1/3f);//engtotal1 변수/3
			System.out.println("전체 학생의 수학평균 :" +mathtotal1/3f);//math변수 /3
		}
	}
		
		

}
