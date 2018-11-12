package com.dismentoring.mypackage;

import java.sql.*;

// server = 192.168.0.32  port:3306  SAC, SAC, SAC

public class DBJdbc {
	
	 
	 Statement stmt = null;
	 
	//DB 서버에 연결하는 메소드 
	public static Connection connectDB() {            
		
		Connection con = null;
		
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			return DriverManager.getConnection("jdbc:mysql://192.168.0.32:3306/SAC?useSSL=false&serverTimezone=UTC", "SAC", "SAC");
			
	    }
		catch(SQLException e) { 
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		return con;
		
	}	
	
    // 데이터를 조회하는 메소드
    public  void select() { 
    	
    	String a;
    	
    	connectDB();  //DB에 접속
    	Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from  SAC_USR"); 
		while(rs.next()) {
			a = rs.getString(1);
			System.out.println("a = " + a);
		}
    }	
	// 데이터를 업데이트하는 메소드 	
	 public void update(int id, String name) {
		 String sql = "UPDATE SAC_USR SET name = ? " + "WHERE id = ?";
		 
		 try {
			 
			 Connection con = this.connectDB(); 
			 PreparedStatement pstmt = con.prepareStatement(sql);
			 pstmt.setInt(1, id);
			 pstmt.setString(2, name);
			 pstmt.executeUpdate();
		 } catch(SQLException e) {
			 System.out.println(e.getMessage());
		 }
			
		
	 }	
} //class