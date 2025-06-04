package com.sist.main;
import java.util.*;
import java.sql.*;
public class DataDAO {
   private Connection conn;
   private PreparedStatement ps;
   private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
   private static DataDAO dao;
   // 드라이버 등록 
   public DataDAO()
   {
	   try
	   {
		   Class.forName("oracle.jdbc.driver.OracleDriver");
	   }catch(Exception ex){}
   }
   // 연결 
   public void getConnection()
   {
	   try
	   {
		   conn=DriverManager.getConnection(URL,"hr","happy");
	   }catch(Exception ex) {}
   }
   public void disConnection()
   {
	   try
	   {
		   if(ps!=null) ps.close();
		   if(conn!=null) conn.close();
	   }catch(Exception ex) {}
   }
   // 싱글턴 => DAO를 한번만 사용이 가능 (메모리 공간을 1개만 생성) = 재사용
   // 스프링에서는 기본 (싱글턴) => 필요시에는 여러개 객체 생성 => prototype
   public static DataDAO newInstance()
   {
	   if(dao==null)
		   dao=new DataDAO();
	   return dao;
   }
   
   // 레시피 
   /*
    *   NO     NOT NULL NUMBER         
		TITLE  NOT NULL VARCHAR2(1000) 
		POSTER NOT NULL VARCHAR2(260)  
		CHEF   NOT NULL VARCHAR2(200)  
		LINK            VARCHAR2(260)  
		HIT             NUMBER 
    */
   public void recipeInsert(RecipeVO vo)
   {
	   try
	   {
		   getConnection();
		   String sql="INSERT INTO recipe VALUES((SELECT NVL(MAX(no)+1,1) FROM recipe),?,?,?,?,0)";
		   ps=conn.prepareStatement(sql);
		   ps.setString(1, vo.getTitle());
		   ps.setString(2, vo.getPoster());
		   ps.setString(3, vo.getChef());
		   ps.setString(4, vo.getLink());
		   ps.executeUpdate();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   disConnection();
	   }
   }
   // 레시피 상세
   /*
    *   NO           NOT NULL NUMBER         
POSTER       NOT NULL VARCHAR2(4000) 
TITLE        NOT NULL VARCHAR2(1000) 
CHEF         NOT NULL VARCHAR2(1000) 
CHEF_POSTER  NOT NULL VARCHAR2(1000) 
CHEF_PROFILE NOT NULL VARCHAR2(1000) 
INFO1        NOT NULL VARCHAR2(100)  
INFO2        NOT NULL VARCHAR2(100)  
INFO3        NOT NULL VARCHAR2(100)  
CONTENT               VARCHAR2(4000) 
FOODMAKE     NOT NULL CLOB           
DATA                  CLOB  
    */
   public void recipeDetailInsert(RecipeDetailVO vo)
   {
	   try
	   {
		   getConnection();
		   String sql="INSERT INTO recipeDetail VALUES("
				   +"?,?,?,?,?,?,?,?,?,?,?,?)";
		   ps=conn.prepareStatement(sql);
		   ps.setInt(1, vo.getNo());
		   ps.setString(2, vo.getPoster());
		   ps.setString(3, vo.getTitle());
		   ps.setString(4, vo.getChef());
		   ps.setString(5, vo.getChef_poster());
		   ps.setString(6, vo.getChef_profile());
		   ps.setString(7, vo.getInfo1());
		   ps.setString(8, vo.getInfo2());
		   ps.setString(9, vo.getInfo3());
		   ps.setString(10, vo.getContent());
		   ps.setString(11, vo.getFoodmake());
		   ps.setString(12, vo.getData());
		   ps.executeUpdate();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   disConnection();
	   }
   }
   public List<RecipeVO> recipeData()
   {
	   List<RecipeVO> list=new ArrayList<RecipeVO>();
	   try
	   {
		   getConnection();
		   String sql="SELECT no,link FROM recipe ORDER BY no ASC";
		   ps=conn.prepareStatement(sql);
		   ResultSet rs=ps.executeQuery();
		   while(rs.next())
		   {
			   RecipeVO vo=new RecipeVO();
			   vo.setNo(rs.getInt(1));
			   vo.setLink(rs.getString(2));
			   list.add(vo);
		   }
		   rs.close();
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   disConnection();
	   }
	   return list;
   }
   
}






