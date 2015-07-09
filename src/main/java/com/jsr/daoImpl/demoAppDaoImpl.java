package com.jsr.daoImpl;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsr.dao.IDemoAppDao;
import com.jsr.entity.Employee;


@Repository
public class demoAppDaoImpl implements IDemoAppDao {
	@Autowired
	private SessionFactory sessionFactory;
	public boolean saveEmployee()  {
		try {
			sessionFactory.getCurrentSession().beginTransaction();
			Employee emp=new Employee();
			//emp.setEmpId(1);
		
			emp.setEmpName("Bhim Kumar");
			sessionFactory.getCurrentSession().save(emp);
			sessionFactory.getCurrentSession().getTransaction().commit();
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		return true;
	}
}

