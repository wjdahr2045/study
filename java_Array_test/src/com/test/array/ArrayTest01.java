package com.test.array;

public class ArrayTest01 {
	int x=30; //�޸� ������ �޶� ����x �ߺ�
	
	
	{
		int x=111111111; //int �� ���� x 111111 �ʱ�ȭ
		//int x;    // ���� x �ߺ�
		System.out.println(x);//���� �������� ��� 
		// ���������ȿ� ������ �ۿ��������� ���
		{
			//int x;      // ���� x �ߺ�
			int y;   //���� y
			{
				//int x;       // ���� x �ߺ�
			}
		}
		
		{
			int y; //���� y
			
		}
	}

	public static void main(String[] args) {
		//1���� �迭 (��)
		int[] intArray = new int[5];// int Ÿ�� �迭������
		intArray[0]=1;// 0�࿡ 1 �ʱ�ȭ
		intArray[1]=2;// 0�࿡ 2 �ʱ�ȭ
		intArray[2]=3;// 0�࿡ 3 �ʱ�ȭ
		intArray[3]=4;// 0�࿡ 4 �ʱ�ȭ
		intArray[4]=5;// 0�࿡ 5 �ʱ�ȭ
		
		int[] intArray2 ={1,2,3,4,5};   // ���� �����ʹ� �����ѹ��  5���������ִ¹迭
		
		int[] intArray3 = new int[]{1,2,3,4,5}; // ���ο� �迭�� �Ҵ��Ҷ� // 5���� �����ִ¹迭
		
		intArray = new int[]{1,2,3,4,5,6,7,8,9,10}; // 10�� �����ִ� �迭
		// ���� ���� �ҋ� ( ������� �ٽ��Ҷ�)
		int[] intArray4 = new int[100]; //int �� intArray4 100�� ����?
		for(int index =0;index<intArray4.length;index++){//indes������ 0���� intArray4���� Ŭ������ index�� 1�����ض�
			intArray4[index]=index+1; // index ������ +1
		}for(int index =0;index<intArray4.length;index++){//indes������ 0���� intArray4���� Ŭ������ index�� 1�����ض�
				System.out.print(intArray4[index]+
						(intArray4[index]% 10 != 0 ? ",":"\n")); //intArray4[index]�� 10�������� ������0�� �ȳ��ö� ,��� �ƴϸ� �ٹٲ�
				//\n �ٹٲ�(new) 
				
				}
		//2���� �迭 (�� x �� )-> �迭�ȿ��迭
		int[][]intArrays = new int [3]/*��*/[3];//�� // 3��3�� �迭����
		int[][] intArrays2={
				            {1,2,3},
				            {4,5,6},
				            {7,8,9}
		                    };//3�� 3�� �迭������
		
		
		int[][]scoreTable ={
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50}
		};                    //3�� 3�� �迭������
		int total =0;//int �� ����total 0 �ʱ�ȭ
		
		//length ����
		for(int row =0;row<scoreTable.length;row++){    //�� �ݺ���
			total=0;//���� �ݺ��ɶ� ���� �ʱ�ȭ
			for(int col =0;col<scoreTable[row].length;col++){//�� �ݺ���
				total+=scoreTable[row][col];//���� �ݺ��ɶ� ��������
			}
			
			
			
			System.out.println((row+1)+"���л����:"+(total*1f/scoreTable[row].length));/* ���л� ��� :total������ scoreTable[row]
			                                                                             �� ���ڿ� ���̸�ŭ �� ���*/ 
		} // ��� ���
		int kortotal1 = 0;   // int ��������		
		int engtotal1 = 0;   // int ��������
		int mathtotal1 = 0;  // int ��������
		
		for(int row=0;row<scoreTable.length;row++){// row�� 0���� row�� scoreTable���ڿ� ���̺��� Ŭ������ row 1�������
			for(int col=0;col<scoreTable[col].length;col++){//col�� 0���� col ��scoreTable[col]���� Ŭ������ col�� 1�����ض� 
				kortotal1+= scoreTable[row][0];//row �࿡ �ִ°��� kortotal1������ ���Ѵ�
				engtotal1+= scoreTable[row][1];//row �࿡ �ִ°��� kortotal1������ ������Ų��
				mathtotal1+= scoreTable[row][2];//row �࿡ �ִ°��� kortotal1������ ������Ų��
			}
			System.out.println("��ü �л��� ������� :" +kortotal1/3f);// kortotal1���� /3
			System.out.println("��ü �л��� ������� :" +engtotal1/3f);//engtotal1 ����/3
			System.out.println("��ü �л��� ������� :" +mathtotal1/3f);//math���� /3
		}
	}
		
		

}
