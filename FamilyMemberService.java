package com.uttara.service;

import java.util.List;

import com.uttara.model.FamilyMember;

public interface FamilyMemberService
{
	public void addFamilymember(FamilyMember familyMember);

	public List<FamilyMember> getAllFamilyMembers();
	public FamilyMember getEscortedByFamilyMember(String name);

}
