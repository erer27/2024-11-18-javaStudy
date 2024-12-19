package exception;
import java.util.*;
import java.sql.*;
/*
 * 		클래스 요소
 * 			=> 라이브러리
 * 				어떤 라이브러리 사용여부
 * 				=> 네트워크 : java.net
 * 				=> 오라클 : java.sql
 * 				=> 파일 : java.io
 * 				=> 전체적으로 사용 : String, Object
 * 							java.lang
 * 			=> 사용자 변수
 * 	
 * 			=> 초기화 방법
 * 			=> 기능 설정
 * 
 * 
 * 		JDBC : 원시소스
 * 		  |
 * 		DBCP : 미리 연결 => 속도
 * 		  |
 * 		****MyBatis : google제공
 * 		  |
 * 		 JPA 
 */
public class MemberDAO {
	// 멤버변수 => 클래스 전체적으로 사용하는 변수
	private Connection conn;// 오라클 연결 => null 초기화
	private PreparedStatement ps;
	//오라클에 명령문 전송/결과값 읽기
	private final String URL="jdbc:oracle:thin:@211.238.142.124:1521:XE";
	// 오라클은 공유된 데이터 => static 변수 
	// 초기화
	public MemberDAO() 
	{
		// 드라이버 등록 
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			//에러 발생 => 확인
			//getMessage():무슨 에러 / printStackTrace() 위치 확인
		}
		
	}
	// 오라클 연결 => 오라클 연결 : 문장전송 : 결과값 읽기 : 오라클 닫기
	// 공통모듈
	// 오라클 연결
	public void getConnection()
	{
		
	}
	// 오라클 닫기
	public void disConnection() {
		
	}
}
