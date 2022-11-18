package com.cool.myapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyappApplicationTests {

	@Autowired
	private DataSource dataSource;

	@Test
	void verifyConnectedDatabase() throws SQLException {
		var connectionString = dataSource.getConnection().getMetaData().getURL();
		var expectedConnectionString = "jdbc:postgresql://localhost:5432/employee";

		assertEquals(expectedConnectionString, connectionString);
	}

}
