package com.sist.dao;
// 로그인 / 회원가입 / 회원탈퇴 / 회원 수정 => 오라클 연결
import java.sql.*;
import com.sist.vo.*;
public class MemberDAO {
	private Connection conn;
	private PreparedStatement ps;
	private static MemberDAO dao;
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	//											211.238.142.124
	// 1. 드라이버 등록
	public MemberDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception ex) {}
	}
	
	// WEB => JDBC => DBCP
	// JDBC => 연결 / 닫기 => 연결에 시간 소모가 많다
	// => 미리 연결한 후에 사용 => 재사용 (반환) => WEB에서 일반화
	// 2. Connection을 한개만 생성 
	
	public static MemberDAO newInstance()
	{
		if(dao==null)
			dao=new MemberDAO();
		return dao;
	}
	
	// 3. 연결
	public void getConnection()
	{
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
		}catch(Exception ex) {}
	}
	// 4. 닫기
	public void disConnection()
	{
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	// 기능
	// 1. 로그인
	public MemberVO isLogin(String id, String pwd)
	{
		MemberVO vo=new MemberVO();
		try
		{
			// 1. 연결
			getConnection();
			// 2. SQL문장 전송 => id존재여부 확인
			String sql="SELECT COUNT(*) FROM member "
						+"WHERE id=?";
			ps=conn.prepareStatement(sql);
			ps.setString(1, id);
			
			// 실행 요청
			ResultSet rs=ps.executeQuery();
			rs.next();
			int count=rs.getInt(1);
			rs.close();
			
			if(count==0) // ID없는 상태
			{
				vo.setMsg("NOID");
			}
			else // ID 있는 상태
			{
				// 비밀번호 확인 
				sql="SELECT id,pwd,name,sex "
						+"FROm member "
						+"WHERE id=?";
				ps=conn.prepareStatement(sql);
				// 실행전에 ?에 값을 채운다
				ps.setString(1, id);
				// 결과값
				rs=ps.executeQuery();
				rs.next(); // 한줄씩 읽어 온다
//							  ---- RECORD
				vo.setId(rs.getString(1));
				vo.setName(rs.getString(3));
				vo.setSex(rs.getString(4));
				String db_pwd=rs.getString(2);
				
				// 비밀번호 검사
				if(db_pwd.equals(pwd)) // 로그인
				{
					vo.setMsg("OK");
				}
				else // 비밀번호가 틀리다
				{
					vo.setMsg("NOPWD");
				}
				// "no="+no
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			disConnection();
		}
		return vo;
	}
	// 2. 회원가입
	// 3. 회원수정
	// 4. 회원탈퇴
}


