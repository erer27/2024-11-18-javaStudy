import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class Car_branch {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@211.238.142.124:1521:XE"; // DB 접속 URL
        String username = "hr_1";  // 오라클 사용자 계정
        String password = "happy";  // 비밀번호

        Connection conn = null;
        PreparedStatement selectStmt = null;
        PreparedStatement updateStmt = null;
        ResultSet rs = null;

        try {
            // 드라이버 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(url, username, password);
            conn.setAutoCommit(false);  // 수동 커밋

            // 1. NULL인 행 조회
            String selectSql = "SELECT no FROM car WHERE branch_no IS NULL";
            selectStmt = conn.prepareStatement(selectSql);
            rs = selectStmt.executeQuery();

            // 2. UPDATE 준비
            String updateSql = "UPDATE car SET branch_no = ? WHERE no = ?";
            updateStmt = conn.prepareStatement(updateSql);

            Random random = new Random();

            while (rs.next()) {
                int carId = rs.getInt("no");
                int randomBranchNo = random.nextInt(7) + 1;  // 1 ~ 7

                updateStmt.setInt(1, randomBranchNo);
                updateStmt.setInt(2, carId);
                updateStmt.addBatch();
            }

            // 3. 일괄 업데이트 실행
            updateStmt.executeBatch();
            conn.commit();

            System.out.println("랜덤 branch_no 값이 성공적으로 업데이트되었습니다.");

        } catch (Exception e) {
            e.printStackTrace();
            try {
                if (conn != null) conn.rollback();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        } finally {
            // 자원 정리
            try { if (rs != null) rs.close(); } catch (SQLException e) {}
            try { if (selectStmt != null) selectStmt.close(); } catch (SQLException e) {}
            try { if (updateStmt != null) updateStmt.close(); } catch (SQLException e) {}
            try { if (conn != null) conn.close(); } catch (SQLException e) {}
        }

	}

}
