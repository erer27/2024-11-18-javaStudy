/*
 * 		HTML / CSS / JavaScript => 프로젝트
 * 		데이터저장 : 변수 => 데이터형
 * 						 | 정수 => byte/int/long
 * 						 | 실수 => double
 * 						 | 논리 => boolean
 * 						 | 문자 => char
 * 						 | 문자열 => String
 * 		데이터 가공 : 연산자 / 제어문
 * 			1) 연산자	
 * 				=> 단항연산자
 * 					증감연산자 ( ++, -- ) => 한개증가 / 한개 감소	
 * 					부정연산자 ( ! ) => 예약일이 아닌 경우
 * 					형변환연산자 => 클래스형변환
 * 								---------
 * 								=> 상속 / 포함 / 라이브러리
 * 					=> UpCasting / DownCasting
 * 					   ---------   ------------
 * 					   | 자동형변환	| 강제형변환
 * 					   long a=10;
 * 							  --- int ==> 10L
 * 					   연산 => 같은 데이터형끼리만 연산처리
 * 					   10.5 + 10
 * 							  ---
 * 							  10.0 => 연산
 * 					   ---------------------
 * 					   *** char는 연산이 된 경우 => 자동으로 int로 변환
 * 				=> 이항연산자
 * 					산술연산자 : +, -, *, /, %
 * 					=> 산술규칙
 * 						1) 자동으로 같은 데이터형으로 변경후에 처리
 * 						2) int이하 => char,short,byte => 연산이 되면
 * 									 결과값 int다
 * 									 int + long = long
 * 									 char + char = int
 * 									 byte + byte = int
 * 						+ : 산술 (더하기)
 * 							문자열 결합용으로 사용
 * 						7+7+"7"+7+7
 * 						---
 * 						14+"7"
 * 					--------------------------------
 * 					비교연산자 : ==, !=, <, >, <=, >=
 * 							  -------
 * 							  JS: ===, !==
 * 							  오라클 : =, <>
 * 							  JSP : eq, ne => EL
 * 					논리연산자 : && , || => 다중조건
 * 					-------------------------------------if문 조건문
 * 					대입연산자 : =, +=, -=
 * 								--------- 증가, 감소
 * 								증가 => 여러개 증가, 감소
 * 								a+=10 ==> a에 10을 더한 값을 저장
 *								===== a=a+10
 *								
 * 				=> 삼항연산자 => 웹(JSP => HTML+Java)
 * 							  ===================
 * 							  | HTML / Java => 분리	
 * 								================== MVC
 * 
 * 							  조건 ? 값1 : 값2
 * 							  ---
 * 							  true => 값1
 * 							  false => 값2
 * 							  => 이전페이지 / 다음페이지
 * 								 ------------------
 * 							  => 웹 핵심 : 사용자 편리성
 * 										 ----------
 * 										1. 화면 UI => 이미지 12~15
 * 				제어문
 * 				1. 조건문
 * 					단일조건문 => 조건이 true일 경우에만 처리	
 * 							   | 부정연산자 / 논리연산자 / 비교연산자
 * 						형식) if(조건문)
 * 							 {
 * 								조건이 true일 때 처리문장
 * 							 }
 * 							 => 독립문장 => 단점은 속도가 느릴 수 있다
 * 					선택조건문 => 조건 true / 조건 false일 때 나눠서 처리
 * 							=> 웹에서 가장 많이 사용되는 문장
 * 							=> 웹 => 무조건 결과값을 전송
 * 							   로그인 => 성공 / 실패
 * 						형식)
 * 							if(조건문)
 * 							{
 * 								조건이 true일 때 처리 문장
 * 								로그인시 => 브라우저 전송 : main페이지 이동
 * 							}
 * 							else
 * 							{
 * 								조건이 false일 때 처리 문장
 * 								로그인 실패시 => 다시 로그인,  회원가입이동
 * 							}
 * 
 * 							*** 자바에 사용자 요청 처리
 * 									 ============= 메소드
 * 								처리결과를 브라우저로 전송한다 ==> 리턴형은 항상 존재 
 * 							-------------------------------------------------
 * 							
 * 							-- 변수명이 여러개 있는 경우 => 제어가 어렵다
 * 													  제어문 사용에 문제 발생
 * 													  반복문사용(데이터)
 * 							1. 배열 : 데이터를 묶어서 사용
 * 									 => 관련된 데이터 : 소스
 * 									 => 한개이름으로 여러개 제어
 * 									 => 변수
 * 									 => 클래스 여러개 (한개 이름으로 제어 => 인터페이스)
 * 																	  | 7장 
 * 							예)
 * 								Board => 글쓰기 , 목록 , 상세보기 , 수정 , 찾기 , 삭제
 * 										 메소드
 * 								-----클래스
 * 								Food => 목록(페이징), 상세보기, 찜하기, 예약하기, 좋아요
 * 													| 위치 => Map
 * 								Recipe => 목록 , 쉐프정보 , 레시피 제작 , 구독 , 검색 ... 
 * 								Seoul => 목록 , 여행코스 , 인근 맛집 , 숙소 , 랜트카 대여 ... 
 * 							
 * 							배열 (일차배열)
 * 							  = 선언
 * 								데이터형[] 배열명; => 권장
 * 								데이텋여 배열명[]; => C언어 호환
 * 								예) => 무한정 설정
 * 								문자열 배열
 * 								String[] arr;
 * 								정수 배열
 * 								int[] arr;
 * 							  = 초기값 설정
 * 								=> 명시적 초기화
 * 									int[] arr={1,2,3,4,5};
 * 								=> 기본값 초기화	
 * 									int[] arr=new int[5]; => 0으로 초기화 (******)
 * 											  ----
 * 											  String => null
 * 											  int => 0
 * 											  double => 0.0
 * 											  boolean => false
 * 								=> 선언후 초기화
 * 								   int[] arr;
 * 								   arr=new int[]{1,2,3,4,5}
 * 								** 연속적으로 메모리 저장
 * 									--------------
 * 									| 메모리 크기가 동일 => 같은 데이터형만 모아서 관리
 * 								** 한번 설정하면 변경이 불가능 => 고정적
 * 									=> 가변형 배열 => 클래스형 (Collection)
 * 										ArrayList / Map / Set
 * 
 * 								** int[] arr=new int[5];
 * 												arr[0] arr[1].....
 * 												   --- 인덱스 / 첨자 => 데이터 구분자
 * 								---arr---		---------------------------
 * 								 0X100				0 | 0 | 0 | 0 | 0 | 0
 * 								---------		|--------------------------
 * 											  0x100
 * 											  ** 인덱스 0부터 순차적 => 반복문 사용이 좋다 
 * 											  arr[0] => 일반변수와 동일
 * 											  ==> 값 변경 / 값 읽기
 * 											  ==> 갯수 : 배열명.length
 * 											  ==> 배열의 크기를 벗어나면 오류 발생
 * 											  for(;i<배열명.length)
 * 													--
 * 
 * 								= 데이터 수정 / 데이터 출력
 * 								1) 값 변경 / 초기 값
 * 								   일반 for문을 이용한다
 * 									=> 인덱스를 이용 
 * 								2) 값 읽기
 * 									for-each를 주로 사용
 *									=> 실제 배열에 저장된 값을 읽기
 *						메소드 : 한 개 기능을 만들어서 => 재사용 
 *						1. 종류	
 *						   = 사용자 정의 메소드
 *							 1) 특정 작업을 하기 위한 명령문의 집합
 *												 -----
 *												 | => ;
 *											  int a=10; => 명령문 ...
 *								 | 기능 처리 
 *								 | ------- 권장 : 한가지 기능만 처리
 *								 | => 재사용, 유지보수(수정이 가능)
 *								 					| 오버라이딩
 *													| 추가 => 오버로딩
 *								** 형상관리 : GIT (공통 프로젝트)
 *									=> 협업 (면접 필수)
 *							2) 메소드 사용 목적
 *								1. 반복되는 기능을 제거
 *								2. 코드관리가 쉽게 => 기능별로 나눠서 처리
 *									= 입력 / 처리 / 출력
 *								3. 소스가 간결하게 제작 
 *								4. 다른 클래스와 연결
 *								5. 재사용률 높인다 
 *							3) 메소드 종류
 *								공통메소드 : 자동으로 메모리에 저장
 *								static
 *								인스턴스 메소드 : 메모리마다 따로 저장
 *								new를 사용해서 저장 
 *								추상메소드 : 선언 => 필요시마다 구현
 *											설계단에서 주로 사용
 *							4) 메소드 만드는 방법
 *								리턴형 : 사용자 요청시 처리된 결과값
 *									   -------------------- 
 *										결과값이 있는 경우
 *										  | 기본형, 배열, 클래스 
 *										결과값이 없는 경우 => 메소드 자체 처리
 *										  | void
 *										 ** 결과값은 무조건 1개만 사용이 가능
 *										 int 메소드명()
 *										 ---- 기본형
 *										 int[] 메소드명()
 *										 ------ 배열
 *										 String 메소드명
 *										 ------ 클래스
 *										 void 메소드명()
 *										 ---- 결과값이 없는 경우
 *										 void System.out.println()
 *								메소드명 : 변수 식별자
 *										 알파벳, 한글 시작
 *										 알파벳은 대소문자 구분
 *										 숫자는 사용 => 앞에서 사용 금지
 *										 공백 사용이 불가능
 *										 키워드는 사용금지
 *										 특수문자 ( $, _ )
 *										 *** 소문자로 시작한다
 *										 *** 구분자 => 메소드명은 중복이 없게
 *										 	 약간의 의미만 부여
 *										 *** 7~15
 *								매개변수 : 여러개 사용이 가능, 없는 경우도 있다
 *										 Math.random(), trim() 
 *										 => 가급적이면 3개 이상이면 클래스/배열을 사용
 *										 => 사용자 요청해서 보내주는 값
 *										 로그인
 *										 로그인(String id, String pwd)
 *											  ----------------------
 *										 회원가입(아이디, 비밀번호, 이름, 이메일, 성별, 생년월일, 주소, 전화...)
 *										 회원가입(Member m)
 *										 변수 => 읽기 / 쓰기 setXxx()
 *												getXxx()
 *										 class Member
 *										 { 
 *											String 아이디, 비밀번호, 이름, 이메일, 성별, 생년월일, 주소, 전화.
 *											int age
 *										 }	
 *
 *								[접근지정어][옵션]리턴형 메소드명(매개변수)
 *								{
 *								}
 *								5) return 사용법
 *								   ------ 메소드가 종료의미
 *								   리턴형이 있는 경우엔 반드시 return 값;
 *								   리턴형이 없는 경우엔 return을 생략할 수 있다
 *									=> 자동 컴파일러에 의해 자동 추가
 *									*** 반드시 리턴을 사용해야 된다
 *										
 *									*** return문은 항상 마지막에 코딩하는 것은 아니다
 *										=> 중간에 처치
 *										=> 조건마다 return을 사용할 수 있다
 *
 *									예)
 *										void login()
 *										{
 *											if(로그인이 안된 경우)
 *												return
 *											else
 *												return => 반복문 break
 *										}
 *								6) 메소드
 *									1. 동작과정 (행위) 
 *									2. 화면에 출력하는 내용 : 리턴형
 *									3. 사용자에게 유도 : 매개변수
 *								
 *								7) 메소드 유형
 *								   ----------------------------
 *									 리턴형		매개변수
 *								   ----------------------------
 *									  o			  o
 *								   ----------------------------
 *									  o			  x
 *								   ----------------------------
 *									  x			  o
 *									  void => 데이터베이스 : insert/update/delete
 *											  출력 => 규정이 된 상태는 아니라
 *								   ----------------------------
 *									  x			 x
 *									  void
 *								   ----------------------------
 *			
 *									메소드 유형
 *									 로그인 =====> boolean isLogin(String id,String pwd)
 *									 목록	 =====> String[] movieList()
 *									 상세 보기 ====> String movieDetail(int movieNo)
 *									 => 리턴형 / 매개변수가 없는 경우는 빈도가 거의 없다
 *						   = 라이브러리에 제공한 메소드 (API) => 이후 API이용
 *							mvnrepository.com
 *
 *					=> 객체지향 프로그램 : Actor
 *					=> 클래스의 구성 요소
 *					  = 변수
 *						변수의 종류
 *					  = 생성자
 *						변수의 초기화 => 초기화블럭
 *					  = 메소드
 *						메소드 종류 
 * 							  
 */
public class 배열_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		return; 
	}

}
