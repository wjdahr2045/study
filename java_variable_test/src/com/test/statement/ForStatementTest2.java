package com.test.statement;

public class ForStatementTest2 {

	public static void main(String[] args) {
		//1~10������ �ִ� ¦���� ���Ͻÿ�
		System.out.println("1~10������ �ִ� ¦���� ���Ͻÿ�");
		int sum = 0;
		for(int i=1;i<11; i++){
			if (i%2==0){
				System.out.println("������ ������ : " + i);
				sum = sum + i;
			}
			
		}
       System.out.println(sum);
       
       //2���� �������� �ۼ��Ͻÿ�
       System.out.println("2���� �������� �ۼ��Ͻÿ�");
       int dan=2;
       for(int gop=1; gop<10; gop++){
    	   System.out.println(dan +"*"+ gop +" = "+dan*gop);
    	   
       }
       
       for(int dann=2; dann<10; dann++){
    	   System.out.println(dann+"���Դϴ�");
    	   for(int gopp=1;gopp<10;gopp++){
    		   System.out.println(dann +"*"+ gopp +" = "+dann*gopp);
    		   
    	   }
    	   System.out.println();
    	   }
    	   
    	   /*char symbol='*';
    	   for(int dannn=1; dannn<11; dannn++){
    		   for(int goppp=1;dannn <= goppp+1; goppp++){
    			   System.out.println(symbol);
    		   }
    		   
    		   System.out.println();
            }
    	   int rows = 10;
    	   for(int roww=1;roww<rows+1;roww++){
    		   for(int numm=1;numm<rows-roww+1;numm++){
    			   System.out.println(symbol);*/
    		  // }
    	  // }
    	   
    	   
	
	}

}
