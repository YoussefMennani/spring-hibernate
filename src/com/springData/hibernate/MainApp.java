package com.springData.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/javaee?useSSL=false";
		String userName = "root";
		String passsword = "password";
		
		try {
			Connection cnx = DriverManager.getConnection(url,userName,passsword);
			System.out.println("Connected with success !");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
