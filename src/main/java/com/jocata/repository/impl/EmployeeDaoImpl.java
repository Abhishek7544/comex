package com.jocata.repository.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.jocata.entity.Employee;
import com.jocata.repository.EmployeeDao;
import com.jocata.utils.HibernateUtils;

@Repository
@Transactional
public class EmployeeDaoImpl implements EmployeeDao{
	
	
	public List<Employee> getAllEmployees() {
		
		Session session=HibernateUtils.getSessionFactory().openSession();
		Query<Employee> querry=session.createNativeQuery("Selct * from EMP");
		return querry.getResultList();
	}
//
//	@Override
//	public Employee getEmployeeById(Long id) {
//		Session session=sessionFactory.getCurrentSession();
//		return session.get(Employee.class, id);
//	}
//
//	@Override
//	public void addEmployee(Employee employee) {
//		Session session=sessionFactory.getCurrentSession();
//		session.save(employee);
//		
//	}
//
//	@Override
//	public void updateEmployee(Employee employee) {
//		Session session=sessionFactory.getCurrentSession();
//		session.update(employee);
//		
//	}
//	@Override
//	public void deleteEmployee(Long id) {
//		Session session=sessionFactory.getCurrentSession();
//		Employee emp=session.load(Employee.class, id);
//		session.delete(emp);	
//	}

	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(Long id) {
		// TODO Auto-generated method stub
		
	}
}
