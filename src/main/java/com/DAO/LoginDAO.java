  

	package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.DBconnection.DBConnection;
import com.DTO.LoginDTO;

	public class LoginDAO {
		
		public LoginDTO checkLoginUser(LoginDTO inLoginDTO) {
			Connection Con=null;		
			PreparedStatement ps=null;		
			ResultSet rs=null;			
			LoginDTO outLoginDTO=new LoginDTO();
			try {
				
		    	Con = DBConnection.getConnection();		
				String query="select username,password from test.login where username=? and password=? " ;
				ps=Con.prepareStatement(query);
				
				ps.setString(1, inLoginDTO.getUsername());
				ps.setString(2, inLoginDTO.getPassword());
				
				rs=ps.executeQuery();
				
				while(rs.next()) {
					outLoginDTO.setUsername(rs.getString("username"));
					outLoginDTO.setPassword(rs.getString("password"));
				}
				
				
			}catch (Exception e) {
				System.out.println(e);
			}
			
			
			return outLoginDTO;
		}
	}
	
			
			