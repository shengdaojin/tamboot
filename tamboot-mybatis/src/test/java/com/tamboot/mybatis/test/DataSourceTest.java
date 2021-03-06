package com.tamboot.mybatis.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSourceTest {
	@Autowired(required = false)
	private DataSource dataSource;
	
	@Test
	public void testDataSource() {
		Assert.assertNotNull(dataSource);
	}
}
