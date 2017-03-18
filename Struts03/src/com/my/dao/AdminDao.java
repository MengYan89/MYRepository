package com.my.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.my.entity.Admin;

public class AdminDao {
	public boolean LoginAdmin(String adminName,String adminPwd){
		boolean returnValue=false;
		
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		String HQL = "select count(*) from Admin  where adminName=:name and adminPwd=:pwd"; 
		Query query = session.createQuery(HQL);
		query.setParameter("name", adminName);
		query.setParameter("pwd", adminPwd);
		Object obj=query.list();
		int count=0;
		if(obj==null||obj.toString().equals("[0]"))
			count=0;
		else
			count=1;
		//System.out.print(obj.toString());
		if(count>0)
			returnValue = true;
		transaction.commit();
		return returnValue;
	}
	
	public boolean QueryAdminName(String adminName){
		boolean key = true;
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		String HQL = "select count(*) from Admin where adminName=:name";
		Query query = session.createQuery(HQL);
		query.setParameter("name", adminName);
		
		Object obj=query.list();
		System.out.print(obj.toString());
		int count=0;
		if(obj!=null && obj.toString().equals("[0]"))
			key = false;
		else
			key = true;
		System.out.print(key);
		transaction.commit();
		return key;
		
	}
	
	public void InserAdmin(Admin admin){
		boolean key = false;
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		SessionFactory sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(admin);
		transaction.commit();
		
		
		
	}
	
	
	
	

}
