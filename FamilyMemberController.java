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
import com.uttara.service.FamilyMemberService;

@Controller
public class FamilyMemberController {
	public FamilyMemberController() {
		System.out.println("MemberDetailsController()");
	}

	@Autowired
	private FamilyMemberService familyMemberService;

	@RequestMapping(value = "/saveFamilyMember", method = RequestMethod.POST)
	public ModelAndView saveFamilyMember(@ModelAttribute FamilyMember familyMember) {
		familyMemberService.addFamilymember(familyMember);
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/familyRegistration", method = RequestMethod.GET)
	public ModelAndView familyRegistration(ModelAndView model) throws IOException {

		FamilyMember familyMember = new FamilyMember();
		model.addObject("familyMember", familyMember);
		model.setViewName("familyRegistration");
		return model;
	}
	@RequestMapping(value = "/")
	public ModelAndView emp(ModelAndView model) throws IOException {
		model.setViewName("home");
		return model;
	}
	@RequestMapping(value = "/listFamilyMember")
	public ModelAndView listFamilyMember(ModelAndView model)
	{
		List<FamilyMember> listFamilyMember = familyMemberService.getAllFamilyMembers();
		model.addObject("listFamilyMember", listFamilyMember);
		model.setViewName("filter2");
		return model;
	}
	
}
