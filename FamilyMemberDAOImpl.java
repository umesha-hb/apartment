package com.uttara.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uttara.model.FamilyMember;

@Repository
public class FamilyMemberDAOImpl implements FamilyMemberDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addFamilyMember(FamilyMember familyMember) {
		sessionFactory.getCurrentSession().saveOrUpdate(familyMember);
		
	}

	@Override
	public List<FamilyMember> getAllFamilyMembers() {
		return sessionFactory.getCurrentSession().createQuery("from FamilyMember")
				.list();
	}

	@Override
	public FamilyMember getEscortedByFamilyMember(String name) {
		 Query query = sessionFactory.getCurrentSession().createQuery("from FamilyMember where ownerName = :name");
		  query.setParameter("name", name);
		  return (FamilyMember) query.list().get(0);
	}

}
