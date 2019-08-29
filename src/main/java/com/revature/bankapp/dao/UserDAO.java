package com.revature.bankapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.bankapp.util.ConnectionUtil;

public class UserDAO {
	
	 public boolean login(String email, String password) throws SQLException {
	        boolean isValidLogin = false;
	        Connection con = ConnectionUtil.getConnection();
		        	        
	        String sql="select * from users where email=? and password=?";
	        PreparedStatement pst = con.prepareStatement(sql);
	        pst.setString(1, email);
	        pst.setString(2, password);
	              
	        ResultSet rs=pst.executeQuery();
	        if(rs.next())
	        {
	        	isValidLogin=true;
	        	
	        }
	        return isValidLogin;
	    }
	 
	 public void register(User user)
	 {
		 Connection con = ConnectionUtil.getConnection();
		 String sql="insert into users(name,email,password) values(?,?,?)";
		 PreparedStatement pst = null;
		try {
			pst = con.prepareStatement(sql);
		} catch (SQLException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
	        try {
				pst.setString(1, user.getName());
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
	        try {
				pst.setString(2, user.getEmail());
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        try {
				pst.setString(3, user.getPassword());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        try {
				pst.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	              
	 }
	

}
