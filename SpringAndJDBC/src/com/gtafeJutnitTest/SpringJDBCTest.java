package com.gtafeJutnitTest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.gtafe.bean.Person;
import com.gtafe.service.PersonService;

public class SpringJDBCTest {
	private static PersonService personservice;

	@BeforeClass
	public static void setUpBeforeClass() {
		ApplicationContext aContext = new ClassPathXmlApplicationContext("beans.xml");
		personservice = (PersonService) aContext.getBean("personService");
	}

	@Test
	public void save() {
		for (int i = 0; i <= 98; i++) {
			personservice.save(new Person("test" + i));
		}

	}

	@Test
	public void getPerson() {
		Person person = personservice.getPerson(1);
		System.out.println(person.getName());
	}

	@Test
	public void update() {
		Person p = personservice.getPerson(1);
		p.setName("巫哲仁");
		personservice.update(p);
	}

	@Test
	public void delete() {
		personservice.delete(2);
	}

	@Test
	public void getPersons() {
		for (Person p : personservice.getPersons()) {
			System.out.println(p.getName());
		}

	}

}
