package com.dismentoring.mypackage;

import java.sql.*;

// server = 192.168.0.32  port:3306  SAC, SAC, SAC

public class DBJdbc {
	
	 
	 //Statement stmt = null;
	 
	//DB ������ �����ϴ� �޼ҵ� 
	public void connectDB() {            
		
		//Connection con = null;
		
		try { 
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			//return DriverManager.getConnection("jdbc:mysql://192.168.0.32:3306/SAC?useSSL=false&serverTimezone=UTC", "SAC", "SAC");
			Connection con = DriverManager.getConnection("jdbc:mysql://192.168.0.32:3306/SAC?useSSL=false&serverTimezone=UTC", "SAC", "SAC");
	    }
		catch(SQLException e) { 
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}	
	
    // �����͸� ��ȸ�ϴ� �޼ҵ�
    public  void select() { 
    	
    	//connectDB(); //DB�� ���� 
    	
    	String sql = "SELECT * from SAC_SUR";
    	
    		try(Connection con = connectDB();
    			PreparedStatement pstmt = con.prepareStatement(sql)){
    			Statement stmt = con.createStatement(); 
    			ResultSet rs = stmt.executeQuery(sql);
    			while(rs.next()) {
    				int id = rs.getInt(1);
    				String name = rs.getString(2);
    				System.out.println("Id = " + id + "name = " + name);
    			} //while 
    		} catch(SQLException e) {
    			System.out.println(e.getMessage());
    		}
    }	
    
	// �����͸� ������Ʈ�ϴ� �޼ҵ� 	
	 public void update(int id, String name) {
		 String sql = "UPDATE SAC_USR SET name = ? " + "WHERE id = ?";
		 
		 try (Connection con = this.connectDB();
			 PreparedStatement pstmt = con.prepareStatement(sql)){
			 pstmt.setInt(1, id);
			 pstmt.setString(2, name);
			 pstmt.executeUpdate();
		 } catch(SQLException e) {
			 System.out.println(e.getMessage());
		 }
	 }	
	 
	 //�����͸� �����ϴ� �޼ҵ� 
	 public void delete(int id) { 
		String sql = "DELETE FROM SAC_USR WHERE id = ?";
		
		try (Connection con = this.connectDB(); 
				PreparedStatement pstmt = con.prepareStatement(sql)){
			pstmt.setInt(1, id);
			pstmt.executeUpdate(); 
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	 }
	 
	 
	 
} //class