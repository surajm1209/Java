package com.practice.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Data;

@Data
@JsonSerialize
@JsonDeserialize
public class Company {

	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCtype() {
		return ctype;
	}
	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
	public String getCddress() {
		return cddress;
	}
	public void setCddress(String cddress) {
		this.cddress = cddress;
	}
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
		this.size = size;
	}
	public Company(String cname, String ctype, String cddress, Integer size) {
		super();
		this.cname = cname;
		this.ctype = ctype;
		this.cddress = cddress;
		this.size = size;
	}
	private String cname;
	private String ctype;
	private String cddress;
	private Integer size;

}
