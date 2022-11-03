package com.uttara.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uttara.dao.VisitorDetailDAO;
import com.uttara.model.Visitor;

@Service
@Transactional
public class VisitorServiceImpl implements VisitorService {

	@Autowired
	private VisitorDetailDAO visitorDetailDAO;

	@Override
	public void addVistors(Visitor visitor) {
		visitorDetailDAO.addVistorDetails(visitor);

	}

	@Override
	public List<Visitor> getAllVisitors() {
		return visitorDetailDAO.getAllVisitorDetails();
	}

}
