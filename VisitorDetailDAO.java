package com.uttara.dao;

import java.util.List;


import com.uttara.model.Visitor;

public interface VisitorDetailDAO {
	public void addVistorDetails(Visitor visitor);

	public List<Visitor> getAllVisitorDetails();
}
