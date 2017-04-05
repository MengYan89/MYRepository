package DAO;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Emd;

public class EmpDAO implements EmpDaoIpml {
	Session session;
	 private Session getSession(){
		 Configuration config = new Configuration().configure(); //src/hibrenate.cgf.xml
		 Session session = config.buildSessionFactory().openSession();
		 return session;
	 }
	public EmpDAO() {
		session = getSession();
		
		
	}
	@Override
	public void save(Emd emp) {
		// TODO Auto-generated method stub
		if(session==null)
			session=getSession();
		Transaction t = session.beginTransaction();
		session.save(emp);
		t.commit();

	}

	@Override
	public void delete(Emd emp) {
		if(session == null)
			session=getSession();
		Transaction t = session.beginTransaction();
		session.delete(emp);
		t.commit();
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Emd emp) {
		// TODO Auto-generated method stub
		if(session == null)
			session = getSession();
		Transaction t = session.beginTransaction();
		session.update(emp);
		t.commit();

	}

	@Override
	public List<Emd> getAll() {
		// TODO Auto-generated method stub
		if(session == null)
			session = getSession();
		Transaction t = session.beginTransaction();
		String HQL = "from Emd";
		List<Emd> list = session.createQuery(HQL).list();
		t.commit();
		return list;
	}

	@Override
	public Emd get(Serializable id) {
		// TODO Auto-generated method stub
		if(session == null)
			session = getSession();
		Transaction t = session.beginTransaction();
		String str = id+"";
		Emd emd = (Emd) session.get(Emd.class, id);
		return emd;
	}

}
