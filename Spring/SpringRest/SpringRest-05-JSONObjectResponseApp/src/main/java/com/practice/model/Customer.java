package com.practice.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Data;

@Data
@JsonSerialize
@JsonDeserialize
public class Customer {
	public Integer getCno() {
		return cno;
	}

	public void setCno(Integer cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Float getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Float billAmount) {
		this.billAmount = billAmount;
	}

	public String[] getTeamNames() {
		return teamNames;
	}

	public void setTeamNames(String[] teamNames) {
		this.teamNames = teamNames;
	}

	public List<String> getStudies() {
		return studies;
	}

	public void setStudies(List<String> studies) {
		this.studies = studies;
	}

	public Set<Long> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(Set<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public Map<String, Object> getIdDetails() {
		return idDetails;
	}

	public void setIdDetails(Map<String, Object> idDetails) {
		this.idDetails = idDetails;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	private Integer cno;
	private String cname;
	private Float billAmount;
	private String[] teamNames;	
	private List<String> studies;
	private Set<Long> phoneNumbers;
	public Map<String,Object> idDetails;
	
	public Company company;
}
