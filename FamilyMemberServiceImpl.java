package com.uttara.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.uttara.dao.FamilyMemberDAO;
import com.uttara.model.FamilyMember;

@Service
@Transactional
public class FamilyMemberServiceImpl implements FamilyMemberService
{

	@Autowired
	private FamilyMemberDAO familyMemberDAO;
	@Override
	public void addFamilymember(FamilyMember familymember) {
		familyMemberDAO.addFamilyMember(familymember);
		
	}

	@Override
	public List<FamilyMember> getAllFamilyMembers() {
		return familyMemberDAO.getAllFamilyMembers();
	}

	@Override
	public FamilyMember getEscortedByFamilyMember(String name) {
		return familyMemberDAO.getEscortedByFamilyMember(name);
	}

	
}
