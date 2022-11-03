package com.uttara.service;

import java.util.List;


import com.uttara.model.Visitor;

public interface VisitorService 
{
	public void addVistors(Visitor visitor);

	public List<Visitor> getAllVisitors();
}
