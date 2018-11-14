package com.dismentoring.mypackage;

import java.sql.*;


public class DBJdbc {
	
	 Statement stmt = null;
	 
	//DB 서버에 연결하는 메소드 
	public static Connection connectDB() throws ClassNotFoundException, SQLException {            
		
		    Connection con = null;
			
		    Class.forName("com.mysql.cj.jdbc.Driver"); 
			//return DriverManager.getConnection("jdbc:mysql://192.168.0.32:3306/SAC?useSSL=false&serverTimezone=UTC", "SAC", "SAC");
			  con = DriverManager.getConnection("jdbc:mysql://192.168.0.32:3306/SAC?useSSL=false&serverTimezone=UTC", "SAC", "SAC");
	    
		    return con;
	}	
	
    // 데이터를 조회하는 메소드
    public static void select() throws ClassNotFoundException { 
    	
    	String sql = "SELECT * from SAC_USR";
    	
    		try(Connection con = connectDB();
    			PreparedStatement pstmt = con.prepareStatement(sql)){
    			ResultSet rs = pstmt.executeQuery(sql);
    			while(rs.next()) {
    				String id = rs.getString("ID");
    				System.out.println(id);
    			} 
    		} catch(SQLException e) {
    			System.out.println(e.getMessage());
    		}
    }	
    
	// 데이터를 업데이트하는 메소드 	
	 public static void update(String usridx, String id) throws ClassNotFoundException {
		 String sql = "UPDATE SAC_USR SET id = ? " + "WHERE usridx = ?";
		 
		 try (Connection con = connectDB();
			 PreparedStatement pstmt = con.prepareStatement(sql)){
			 pstmt.setString(1, usridx);
			 pstmt.setString(2, id);
			 pstmt.executeUpdate();
		 } catch(SQLException e) {
			 System.out.println(e.getMessage());
		 }
	 }	
	 
	 //데이터를 삭제하는 메소드 
	 public void delete(String usridx) throws ClassNotFoundException { 
		String sql = "DELETE FROM SAC_USR WHERE id = ?";
		
		try (Connection con = connectDB(); 
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setString(1, usridx);
			pstmt.executeUpdate(); 
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	 }
} //class