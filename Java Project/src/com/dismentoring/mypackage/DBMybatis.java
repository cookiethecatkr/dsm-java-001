package com.dismentoring.mypackage;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class DBMybatis {
	public static void connectMybatis() throws IOException {
	    
		try {
		String resource = "com/dismentoring/mypackage/config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(inputStream);
		
		SqlSession session = factory.openSession();
		System.out.println(session);
		}catch(PersistenceException e) {
			e.printStackTrace();
		}
	}
}
