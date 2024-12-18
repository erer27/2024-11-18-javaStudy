package com.sist.exception;
// try~catch~finally
// finally는 생략이 가능
// 사용처 => 파일 닫기, 오라클 연결 해제, 서버 연결 해제
// try (정상수행) catch(오류발생) 상관없이 무조건 수행
import java.io.*; // 파일 읽기 => CheckException
/*
 * 		FileReader fr;
 * 		try
 * 		{
 * 			FileReader fr=new FileReader()
 * 		}catch(IOException e)
 * 		{
 * 		}
 * 		finally
 * 		{
 * 			fr(X)
 * 		}
 */
public class 예외처리_finally사용법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FileReader fr=null;// 메모리주소를 가지고 있지 않은 상태
		// 모든 클래스의 초기값은 null
//		try
//		{
//			fr=new FileReader("c:\\javaDev\\seoul_nature.txt");
//			int i=0; // => 한글자씩 읽어온다
//			// => 정수형으로 'A' => 65
//			while((i=fr.read())!=-1)
//			{
//				// -1 => EOF
//				System.out.print((char)i);
//			}
//			
//		}catch(IOException ex) // Exception, Throwable
//		{
//			ex.printStackTrace();
//		}
//		finally
//		{
//			// 무조건 파일 닫기
//			try
//			{
//				fr.close();
//			}catch(IOException e) {}
//		}
		// 자동 => resource
		try(FileReader fr=new FileReader("c:\\javaDev\\seoul_nature.txt")){
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
			//자동으로 파일 닫기가 가능
		}catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
