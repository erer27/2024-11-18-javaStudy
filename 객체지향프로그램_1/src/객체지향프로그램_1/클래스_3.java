package 객체지향프로그램_1;

import java.text.DecimalFormat;

/*
 * 		프로그램 ================= 저장			======== 화면 UI ===== 구현	=> 테스트		=> 배포
 * 		요구사항분석				데이터베이스									|			|
 * 																					   발표(더블클릭)
 * 		(벤치마킹)															  단위테스트(JUnit)
 * 		  |																  디버깅
 * 		기능 설정
 * 		필요한 데이터를 추출
 * 		==============			==========		======			=======
 * 			|						|			 출력				  |
 * 		 클래스 설계				  메모리 할당					  클래스와 클래스 연관
 * 		=> 메소드					  => new						  |
 * 		=> 변수																	
 * 		   |						|							클래스 다이어그램
 * 		  유스케이스 다이어그램		  정규화 (1~3)
 * 
 * 		객체 : 현실세계에 있는 모든 사물(Object) => OOP
 * 			  -------------------
 * 				| 단순화 (시뮬레이션) => 가정
 * 				  ----- 추상화 : 누구나 생각하는 공통도니 데이터를 추출
 * 				    | 개발자만 알아 보면 된다
 * 		예)
 * 			사원 관리
 * 			-------
 * 			사번 / 이름 / 부서명 / 직위 / 입사일 / 근무지 / 연봉 / 성과급
 * 			출근한다 / 영업한다 / 점심 먹는다 => 메소드
 * 
 * 			변수 추출 => 기능 추출 => 구현 => 사용
 * 					   | 추가, 수정
 * 			=> 클래스는 사원 => 1명에 대한 정보를 가지고 있다
 * 			=> 컴퓨터 => 1개만 설계
 * 			=> 영화 => 1개
 * 			=> 레시피 => 1개 
 * 
 * 		
 */
// 변수 => 1. 기본형, 2. 배열, 3. 클래스 => 배열화
// 평점, 구분 번호, String, actor, String[]
// Card[]
/*
 * 		1. 클래스 구성요소
 * 		class ClassName
 * 		{
 * 			-------------
 * 			변수
 * 			 1. 변수의 종류
 * 				= 인스턴스변수(객체변수)
 * 				  new이용해서 메모리 따라 저장이 가능하게 만든다
 * 				  인스턴스 : 메모리에 데이터가 저장된 상태
 * 				  객체 = 인스턴스
 * 				= 공통변수(정적변수)
 * 				  모든 객체가 공통으로 사용하는 변수 
 * 				   => 메모리 공간이 한개				  
 * 				
 * 			-------------
 * 			생성자
 * 			-------------
 * 			메소드
 * 			-------------
 * 		}
 * 		
 * 		=> new : 클래스의 메모리 크기를 확인후에 메모리를 할당
 * 										 ----------
 * 										 메모리 공간 생성
 * 										 사용된 주소값을 객체에 넘겨준다
 * 			생성자 : 변수의 초기값을 대입 => 메모리에 초기값을 넘겨준다
 * 
 * 			=> new 생성자()
 * 
 * 		class A
 * 		{
 * 			int aa; => 0
 * 			double dd; => 0.0
 * 			static char cc; => '\0'
 * 		}
 * 
 * 	--cc--
 * 	 '\0'	=> a,b사용이 가능 => 로고, 학교명, 학원명...
 * 	------		   ---
 * 				  |읽기, 쓰기, 변경 => 공통메모리, 공유메모리
 * 	
 * 		
 * 		A a=new A(); => 메모리 생성
 * 		---
 * 		   |
 * 		---b---
 * 		  100 ==> 해당 주소에 있는 데이터만 접근이 가능
 * 		-------		100------------ ==> a.aa, a.dd
 * 						---aa--
 * 						   0
 * 						-------
 * 
 * 						---dd--
 * 						  0.0
 * 						-------
 * 					----------------
 * 			new => 사용시마다 클래스 크기만큼 메모리를 생성한다
 * 			----------------------------------------
 * 			1. 클래스는 한개만 설계
 * 			2. new 여러개를 저장해서 사용
 * 			3. 사용자 정의 클래스 => 일반 변수와 동일
 * 			   ------------- 사용자 정의 데이터형 : 배열, 읽기, 쓰기, 변경
 * 
 * 		---------------------------------------------------------------------------
 * 		종류					메모리 저장		메모리 해제	저장위치		사용범위		사용방법
 * 							  시점		  	   시점	
 * 		---------------------------------------------------------------------------
 * 		인스턴스변수			new를 이용해서	 	프로그램		Heap		클래스 전체
 * 							저장			  	 종료						 다른 클래스
 * 		---------------------------------------------------------------------------
 * 		정적변수(공유변수)		컴파일시에 자동		프로그램		MethodArea		클래스
 * 							 메모리 할당		  종료
 * 							 한개만 생성
 * 		---------------------------------------------------------------------------
 * 		지역변수				메소드 호출시마다 메소드 종료		 Stack		{}		변수명 
 * 							=> 매개변수 포함
 * 		---------------------------------------------------------------------------
 * 
 * 
 */
class Recipe2
{
	String poster; // null
	String title; // null
	String chef; // null
	String chef_poster; //
	int star;// 0
	int hit;// 0
	
}
public class 클래스_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. recipe 저장
		//1. 데이터를 저장할 메모리 공간 (메모리 할당)
		Recipe2 recipe1=new Recipe2(); // 24byte메모리 생성
		// => 기본형, 클래스형 ==> 4byte
		// => 데이터 초기화
		recipe1.poster="https://recipe1.ezmember.co.kr/cache/recipe/2024/11/24/565de119b099835a80ffdfc4006583621_m.jpg";
		recipe1.title="치킨너겟 교촌 허니콤보 만들기";
		recipe1.chef="태형제맘";
		recipe1.chef_poster="https://www.10000recipe.com/recipe/7039214";
		recipe1.hit=1845;
		recipe1.star=5;
		//변수값 지정
		//저장된 데이터 출력 => 메모리 구조가 2중
		System.out.println("레시피 포스터:"+recipe1.poster);
		System.out.println("레시피 제목:"+recipe1.title);
		System.out.println("쉐프명 :"+recipe1.chef);
		System.out.println("쉐프 포스터:"+recipe1.chef_poster);
		
		// 정수 => 변경
		DecimalFormat df=new DecimalFormat("###,###");
		System.out.println(df.format(recipe1.hit));
		
		for(int i=1;i<=recipe1.star;i++) {
			System.out.print("★");
		}
		
		//=> recipe2에 데이터를 저장 => 출력
		Recipe2 recipe2=new Recipe2();
		recipe2.poster="https://recipe1.ezmember.co.kr/cache/recipe/2024/11/29/90f0a79083c1000c78cac7882ab984051_m.jpg";
		recipe2.title="간단간식 데리야끼소스 데리야끼 떡볶이 안매운떡볶이 가래떡떡볶이";
		recipe2.chef="쿡따라";
		recipe2.chef_poster="https://www.10000recipe.com/recipe/7039539";
		recipe2.hit=161;
		recipe2.star=5;
		
		System.out.println();
		System.out.println("레시피 포스터:"+recipe2.poster);
		System.out.println("레시피 제목:"+recipe2.title);
		System.out.println("쉐프명 :"+recipe2.chef);
		System.out.println("쉐프 포스터:"+recipe2.chef_poster);
	}

}
