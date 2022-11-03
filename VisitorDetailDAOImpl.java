package com.uttara.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uttara.model.Visitor;

@Repository
public class VisitorDetailDAOImpl implements VisitorDetailDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addVistorDetails(Visitor visitor) {
		sessionFactory.getCurrentSession().saveOrUpdate(visitor);

	}

	@Override
	public List<Visitor> getAllVisitorDetails() {
		return sessionFactory.getCurrentSession().createQuery("from Visitor").list();
	}

}
