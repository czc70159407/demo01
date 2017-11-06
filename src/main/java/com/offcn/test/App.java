package com.offcn.test;

import static org.junit.Assert.*;

import java.sql.Connection;

import org.junit.Test;

import com.offcn.utils.DbcpUtils;

public class App {
	@Test
	public void testName() throws Exception {
		String ss = Double.toString(22);
		System.out.println(ss);
		
		double m=22.0;
		System.out.println(Integer.toString( (int)m));
	}
}
