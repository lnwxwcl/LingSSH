package com.gtafe.AI.Test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.gtafe.AI.doMain.User;

public class TestSpring {
	private ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");

	//测试session工厂
	@Test
	public void testHibernate(){
		SessionFactory sessionFactory=(SessionFactory) ac.getBean("sessionFactory");
		Session session=sessionFactory.openSession();
		String hql = "FROM User where Username='admin'";  
		List<User> users=session.createQuery(hql).list();  
        for (User u: users) {  
            System.out.println(u.getUsername());  
            System.out.println(u.getIsAdmin());  
        }  
	}
}
