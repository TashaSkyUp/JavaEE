package com.tsu.ioc;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IocApplicationTests {

	@Test
	public void contextLoads() {
		IocApplication a = new com.tsu.ioc.IocApplication();
		String[] arg =new String[] {"empty"};
		a.main(arg);
		
	assertNotNull(a );
	}

}
