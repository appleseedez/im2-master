/**
 * Copyright (c) 2011-2014 iTel Technology Inc,All Rights Reserved.
 */

package com.weheros.platform.test;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @ClassName: MysqlTest
 * @author Administrator
 * @date 2014年5月4日 下午4:00:34
 */
public class MysqlTest {

	public static void main(String[] args) {
		System.out.println("MySQL Connect Example.");
		Connection conn = null;
		String url = "jdbc:mysql://127.0.0.1:3306/im2db";
	
		String driver = "com.mysql.jdbc.Driver";
		String userName = "root";
		String password = "123456";
		try {
			Class.forName(driver).newInstance();
			conn = DriverManager
					.getConnection(url, userName, password);
			System.out.println("Connected to the database");
			conn.close();
			System.out.println("Disconnected from database");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
