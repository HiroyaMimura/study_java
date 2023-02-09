package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver");
		} catch(ClassNotFoundException e){
			throw new IllegalStateException("ドライバのロードに失敗しました");
		}
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:h2:~/mydb");
			PreparedStatement pstmt = con.prepareStatement("SELECT * FROM MONSTERS WHERE NAME = ?");
			pstmt.setString(1,"ゴブリン");
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("ゴブリンのHPは" + rs.getInt("HP"));
			} else {
				System.out.println("ゴブリンはありませんでした");
			}
			rs.close();
			pstmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			if(con != null) {
				try {
					con.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
