package com.my.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.my.entity.Users;

public class UserDao {
	public List QueryUsers(){
		
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		String HQL = "from Users";
		List<Users> list = session.createQuery(HQL).list();
		for(Users stu:list){  
            System.out.println(stu.getUserName()+" "+ stu.getPhone()+"  "+stu.getUserId());  
        }  
		transaction.commit();
		return list;
	}

}
