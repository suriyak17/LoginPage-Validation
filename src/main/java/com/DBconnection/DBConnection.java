

	package com.DBconnection;

	import java.sql.Connection;
    import java.sql.DriverManager;

	public class DBConnection {

		public static Connection getConnection() {
			Connection con=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");

				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
				
			}catch (Exception e) {
				
			}
			return con;
	}
	}



