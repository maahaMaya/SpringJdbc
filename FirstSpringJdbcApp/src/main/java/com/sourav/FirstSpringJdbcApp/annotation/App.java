package com.sourav.FirstSpringJdbcApp.annotation;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		JdbcTemplate jd = context.getBean("jdbc", JdbcTemplate.class);
		System.out.println("MYSQL connection :: " + jd);
		System.out.println("Db Connection :: " + jd.getDataSource().getConnection());

	}
}
