package com.sist.exception;
import java.util.Scanner;
public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] arr=new int[2];// 배열범위, 0
		try {
			System.out.println("첫번째 정수 입력:");
			String s1=scan.next();
			System.out.println("두번째 정수 입력:");
			String s2=scan.next();
			
			arr[0]=Integer.parseInt(s1);
			arr[1]=Integer.parseInt(s2);
			
			int result=arr[0]/arr[1];
			System.out.println("result="+result);
		}
		catch(NumberFormatException e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(RuntimeException e) {
			System.out.println("에러발생");
		}
		System.out.println("정상수행");
		// 정상 수행 => catch는 수행하지 않는다
		// try 안에서 오류 발생시 catch 수행
	}

}
