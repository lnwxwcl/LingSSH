package com.gtafe.AI.Test;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Installer {
	public static void main(String[] args) {
		//初始化数据
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		SessionFactory sessionFactory = (SessionFactory) ac.getBean("sessionFactory");
		System.out.println(sessionFactory);
	}
}
