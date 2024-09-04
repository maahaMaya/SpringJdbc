package com.sourav.FirstSpringJdbcApp.xml;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/sourav/FirstSpringJdbcApp/xml/config.xml");
		JdbcTemplate jd = context.getBean("jdbcTemplate", JdbcTemplate.class);
		System.out.println(" MYSQL connection :: " + jd); // MYSQL connection
		System.out.println("Db connection :: " + jd.getDataSource().getConnection()); // Db connection
	}
}
