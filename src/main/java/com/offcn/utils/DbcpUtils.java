package com.offcn.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class DbcpUtils {
private static DataSource ds = null;
	
	static{
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:beans.xml");
		ds=context.getBean("dataSource",DataSource.class);	
		
	}
	
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
			
			conn = ds.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	
	public static void close(Connection conn){
		if(conn!=null){
			try {
				//�ظ�Ĭ��״̬
				conn.setAutoCommit(true);
				//�Żص���Դ����
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
