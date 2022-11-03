package com.uttara.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uttara.model.FamilyMember;
import com.uttara.model.Visitor;
import com.uttara.service.FamilyMemberService;
import com.uttara.service.VisitorService;

@Controller
public class VistorDetailController {
	@Autowired
	private VisitorService visitorService;
	@Autowired
	private FamilyMemberService familyMemberService;


	public VistorDetailController() {
		System.out.println("VistorDetailController()");
	}
	
	@RequestMapping(value = "/saveVisitor", method = RequestMethod.POST)
	public ModelAndView saveVistors(@ModelAttribute Visitor visitor) {

		int openTime = 9;
		int CloseTime = 6;
		FamilyMember familyMember = familyMemberService.getEscortedByFamilyMember(visitor.getEscortedBy());
		if(familyMember.getOwnerName().equals(visitor.getEscortedBy()) && familyMember.getFlatNo().equals(visitor.getFlatNo())
				&&visitor.getEntryDateTime().getHour()>=openTime&&visitor.getEntryDateTime().getHour()<=CloseTime)
		{
			visitorService.addVistors(visitor);
		}
		return new ModelAndView("home");
	}
	
	@RequestMapping(value = "/visitorreg", method = RequestMethod.GET)
	public ModelAndView vistorRegistration(ModelAndView model) throws IOException {
	
		Visitor visitor = new Visitor();
		model.addObject("visitor", visitor);
		model.setViewName("visitorRegistration");
		return model;
	}
	@RequestMapping(value = "/listvistors")
	public ModelAndView listVistors(ModelAndView model)
	{
		List<Visitor> listVistorDetails = visitorService.getAllVisitors();
		System.out.println("listVistorDetails :"+listVistorDetails);
		model.addObject("listVistorDetails", listVistorDetails);
		model.setViewName("filter3");
		return model;
	}
	
}
