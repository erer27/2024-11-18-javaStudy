package com.sist.exception;

import java.util.Arrays;

public class 예외처리_CheckException_예제_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
					int[] lotto =  new int[6];
					for(int i=0;i<lotto.length;i++) {
						
					}
					
					Arrays.sort(lotto);
					for(int i:lotto)
					{
						Thread.sleep(1000); // 선언 => throws
						System.out.println(i+" ");
					}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		finally{
			System.out.println("프로그램 종료");
		}
	}

}
