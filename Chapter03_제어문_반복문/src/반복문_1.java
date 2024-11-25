/*
 * 		자바에서 제공하는 반복문 / 반복제어문
 * 		=> 목록 출력
 * 		=> 반복문의 종류
 * 			1) for => 65page => 반복문중에 가장 많이 사용되는 제어문
 * 				=> for / if
 * 				=> 반복횟수가 지정된 경우에 주로 사용 => 10반복
 * 			2) while => 70page => 데이터베이스 / 파일읽기
 * 				=> 반복 횟수가 없는 경우
 * 				=> 선조건 (조건을 먼저 검색) => 한번도 수행을 못할 수 있다
 * 			3) do~while 75page => 자바에는 사용 빈도가 거의 없다
 * 				=> 반복 횟수가 없는 경우
 * 				=> 후조건 ( 조건을 나중에 검색 ) => 무조건 한번 이상 수행
 * 				=> 게임이나 네트워크 서버 제작
 * 			   --------
 * 				| 한 번 사용하고 버린다
 * 			4) 쉬프트연산자 / 비트연산자 / 반전연산자 => 웹에서는 사용하지 않는다
 * 				============================
 * 					|		  |			  |
 * 				이동연산자	   &(*), |(+)	음수=>양수, 양수=>음수
 * 				<< , >>
 * 
 * 		반복문
 * 		=====
 * 			65page
 * 			for : 반복횟수가 지정된 경우에 주로 사용되는 반복문
 * 			형식)
 * 				for(초기식:조건식:증감식)
 * 					반목수행문장
 * 				====================
 * 					실행문장 => 독립문장 (for와 관련없다)
 * 				for(초기식;조건식;증감식)
 * 				{
 * 					문장 1
 * 					문장 2
 * 					문장 3
 * 					...
 * 					...
 * 				}
 * 
 * 
 * 				** 자바에서 모든 제어문 바로 밑에 있는 문장 1개만 수행
 * 				** 제어문을 이용해서 여러개 문장을 수행시에는 {}
 * 
 * 				1) 초기식 : 시작점 int i=1
 * 				2) 조건식 : 끝점 i<=10 = false
 * 				3) 증감식 : 중가 => ++/--, +=, -=
 * 	
 * 			1) for 동작 순서
 * 					   | false면 종료 (반복문 종료)
 * 				1 ---> 2 <--- 4
 * 			for(1.초기값;2.조건식;4.증감식)
 * 			{			| true
 * 				3.반복실행문장
 * 			}
 * 			1은 한번만 수행 => 초기식
 * 			2조건식 : false가 될때까지 수행 => true/false
 * 										  부정연산자, 비교연산자, 논리연산자
 * 			4증감식 : 2조건식이 false가 나올때까지 증가/감소
 * 			3반복실행문장 : 조건이 true일때까지 수행
 * 
 * 			1 => 2 => 3 => 4
 * 				 2 => 3 => 4
 * 				 2 => 3 => 4
 * 				 2 => 3 => 4
 * 				 |false면 종료
 * 
 * 			1 시작 2 끝 3 실행문장 4 증가
 * 			예) 1~10
 * 				int i=1 i<=10 i++
 * 				A~Z
 * 				char c='A' c<='Z' c++
 * 				10~1
 * 				int i=10 i>=1 i--
 * 				Z~A
 * 				char c='Z' c>='A' c--
 */
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hello Java!! => 5번 출력
		System.out.println("Hello Java!!");
		System.out.println("Hello Java!!");
		System.out.println("Hello Java!!");
		System.out.println("Hello Java!!");
		System.out.println("Hello Java!!");
		System.out.println("==================");
		for(int i=1; i<=5; i++) { // 줄수
			System.out.println("Hello Java!");
		}
		System.out.println("=================");
		for(int i=5; i>=1; i--) {
			System.out.println("Hello Java!!");
		}
		// Cookie에 저장 => 역순 (최신순) => 게시물 / 예약현황 => DESC
	}

}
