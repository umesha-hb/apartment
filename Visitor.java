package com.uttara.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "visitor_member_details")
public class Visitor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "visitor_name")
	private String visitorName;
	@Column(name = "flat_no")
	private String flatNo;
	@Column(name = "entry_date_time")
	private LocalDateTime entryDateTime;
	@Column(name = "exit_date_time")
	private LocalDateTime exitDateTime;
	@Column(name = "visit_purpose")
	private String visitPurpose;
	@Column(name = "escorted_by")
	private String escortedBy;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVisitorName() {
		return visitorName;
	}
	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public LocalDateTime getEntryDateTime() {
		return entryDateTime;
	}
	public void setEntryDateTime(LocalDateTime entryDateTime) {
		this.entryDateTime = entryDateTime;
	}
	public LocalDateTime getExitDateTime() {
		return exitDateTime;
	}
	public void setExitDateTime(LocalDateTime exitDateTime) {
		this.exitDateTime = exitDateTime;
	}
	public String getVisitPurpose() {
		return visitPurpose;
	}
	public void setVisitPurpose(String visitPurpose) {
		this.visitPurpose = visitPurpose;
	}
	public String getEscortedBy() {
		return escortedBy;
	}
	public void setEscortedBy(String escortedBy) {
		this.escortedBy = escortedBy;
	}
	
	
}
