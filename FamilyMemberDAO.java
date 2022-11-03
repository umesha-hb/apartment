package com.uttara.dao;

import java.util.List;


import com.uttara.model.FamilyMember;

public interface FamilyMemberDAO {
	public void addFamilyMember(FamilyMember familyMember);

	public List<FamilyMember> getAllFamilyMembers();
	public FamilyMember getEscortedByFamilyMember(String name);

	
}
