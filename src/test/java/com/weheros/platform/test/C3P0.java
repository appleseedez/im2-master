package com.weheros.platform.test;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class C3P0 {

	private static ComboPooledDataSource cpds = new ComboPooledDataSource();
    

	public static void makepool() {
		try {
			cpds = new ComboPooledDataSource();
			cpds.setDriverClass("com.mysql.jdbc.Driver");
			cpds.setJdbcUrl("jdbc:mysql://localhost:3306/im2db");
			cpds.setUser("root");
			cpds.setPassword("123456");
			cpds.setMaxPoolSize(50);
			cpds.setMinPoolSize(5);
			cpds.setAcquireIncrement(2);
		} catch (PropertyVetoException ex) {
			// handle exception...not important.....
			ex.printStackTrace();
		}

	}

	public static Connection getConnection() throws SQLException {
		
		return cpds.getConnection();
	}

	
	public static void main(String[] arr) {
		makepool();
		try {
			for(int i=0;i<15;i++){
				C3P0.getConnection();
			    //String name=C3P0.getConnection().getSchema();
			    System.out.println("-------------------dbname is-------------"+i);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
