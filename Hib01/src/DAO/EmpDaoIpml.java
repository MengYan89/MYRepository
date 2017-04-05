package DAO;

import java.io.Serializable;
import java.util.List;

import org.hibernate.cfg.Configuration;

import bean.Emd;

public interface EmpDaoIpml{
	
	void save(Emd emp);
	void delete(Emd emp);
	void update(Emd emp);
	List<Emd> getAll();
	Emd get(Serializable id);
	

}
