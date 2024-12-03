/*
 * 		문자열 배열
 * 		String[] 배열명={"","","","",""}
 * 		String[] 배열명=new String[10]; => default => null
 * 
 * 		int[] aa; aa=null ==> 배열 / 클래스 => 메모리 주소를 참조
 * 		=> 배열 => [
 * 		=> 클래스 => 클래스@주소
 */
import java.util.*;
public class 문자열_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 		배열도 변수의 일종
		 * 			 --------- 여러개의 데이터를 저장이 가능
		 * 			 => 한개의 이름으로 제어가 가능
		 * 				-------------- 구분이 가능하게 => 각 변수마다 인덱스를 부여해주는거
		 * 					arr[0] arr[1].... 0부터 ~ 순차적
		 * 									  ------------ 반복문 사용이 가능
		 * 			 => 고정적 => 한번 선언하면 변경이 어렵다 ...
		 * 				---- 동적으로 생성 (가변형: Collecntion)
		 * 
		 */
		String[] names= {"홍길동","박문수","강감찬","이순신","김두한"}; // 고정
		// 문자열 => 데이터추가/데이터수정(X) => 검색 
		// 문자열 => 오라클 명령어 "SELECT * FROM table_name"
		// 전체 출력
		// 일반 for => 데이터 수정, 데이터 추가 => 인덱스
		for(int i=0; i<names.length;i++) {
			System.out.println(names[i]+" ");
		}
		System.out.println();
		// for-each => 브라우저 / 윈도우 => 인덱스 이용(X), 실제 저장된 값
		for(String name:names) {
			System.out.println(name+" ");
		}
		System.out.println();
		// 라이브러리 => 확인
		System.out.println(Arrays.toString(names));
		List list=new ArrayList();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");
	}

}
