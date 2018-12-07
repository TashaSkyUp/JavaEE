package com.tsu.ioc;

import java.io.Console;

import javax.swing.Spring;

import org.springframework.beans.factory.xml.XmlReaderContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class IocApplication {

	public static void main(String[] args) {
		ApplicationContext myAppC = SpringApplication.run(IocApplication.class, args);
		
		Sim b = (Sim) myAppC.getBean("Airtel");
		System.out.println("here is the iocapplication.java ");
		b.calling();
		//ApplicationContext myXmlAppC = myAppC. XmlReaderContext("beans.xml");
		
		//SpringApplication
		
	}
}
