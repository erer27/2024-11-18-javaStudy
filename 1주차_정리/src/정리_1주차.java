/*
 * 		1장 : 자바 특징 / 자바 설치 / 주의점
 * 						jdk.java.net/17
 * 						classpath: .;c:\jdk-17.0.2\lib
 * 						path : c:\jdk-17.0.2\bin
 * 
 * 						=> 대소문자 구분
 * 						=> 들여쓰기
 * 						=> 주석 : 프로그램 분석
 * 						=> ctrl+shift+/
 * 							ctrl+shift+\
 * 				
 * 							ctrl+/ 한줄 주석
 * 							ctrl+\ 해제
 * 						=> ctrl+space => 자동 완성기
 * 				====== 호환성, 메모리 자동 회수 ( 가비지 컬렉션 ), 멀티쓰레드 
 * 		2장 : 변수 / 연산자
 * 				===
 * 				1) 한개의 데이터를 저장하는 메모리 공간의 별칭
 * 									 ===== 주소
 * 					=> 역할 : 쓰기(메모리 저장=대입), 읽기, 수정
 * 						int a=10                a    a=100
 * 						변경이 가능한 값 / 변경이 안되는 값 (상수)
 * 						변수)
 * 							데이터형 변수명;
 * 						상수)
 * 							final 데이터형 변수명=10; => 오류발생
 * 							=> 배열의 갯수 => 상수
 * 							=> 상수 : 데이터형의 최대값, 최소값
 * 				2) 메모리 크기 결정
 * 					=> 기본형 / 참조형
 * 					   ====	  =====| 사용자 정의 => class
 * 					   |자바에서 지원
 * 						정수형
 * 							byte : 1byte, 네트워크 전송, 파일읽기
 * 									-127~128
 * 									** 8bit - 1byte
 * 									   ----- 0,1을 채우는 공간
 * 							(0) 1	1	1	1	1	1	1
 * 							    64   32  16  8   4   2   1
 * 							    =========================== + 127
 * 							== 부호 (음수 : 1, 양수 : 0)
 * 							int : 4byte => 컴퓨터의 모든 정수는 int다
 * 								  -21억 4천 ~ 21억 4천
 * 						
 * 							long : 8byte => 10L(1)
 * 						문자형
 * 						  char : 2byte => 0~65535 => 멀티바이트(unicode)
 * 								 => 표기법 '' => 한글자 설정
 * 							
 * 						  => 한글자만 저장이 가능 => 불편 => 여러개 동시에 저장
 * 													   -------------
 * 													   |String : 문자열 ""
 * 						실수형
 * 							double : 8byte => 소수점 15자리
 * 
 * 						논리형
 * 							boolean : 1byte => true/false
 * 					byte < char < int < long < double
 * 					---------------------------------- 암기
 * 		3장 : 제어문
 * 		4장 : 배열
 * 		5장 : 객체지향 프로그램
 * 		6장 : 상속
 * 		7장 : 추상클래스 / 인터페이스
 * 		8장 : 예외처리
 * 		9장 ~  라이브러리
 * 				***java.util / java.lang / ***java.io / java.net / ***java.sql
 */
import java.util.*;
public class 정리_1주차 {
	public static void main(String[] args) {
		//Scanner scan = new Scanner(null)
		//모든 데이터형에 대한 정보를 가지고 있는 클래스 => Wrapper
		//System.out.println(Byte.MAX_VALUE);
		
//		int[] arr= {30,40,20,50,10};
//		Arrays.sort(arr);
//		
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]>arr[j]) {
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(arr));
		
		
	}
}
