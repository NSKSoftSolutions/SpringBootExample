package com.nsksoft.bean;

import org.springframework.stereotype.Component;

@Component
public class Organization {

	
    private String orgname;
	private String orgemail;
	private String orgadd;
	public String getOrgname() {
		return orgname;
	}
	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}
	public String getOrgemail() {
		return orgemail;
	}
	public void setOrgemail(String orgemail) {
		this.orgemail = orgemail;
	}
	public String getOrgadd() {
		return orgadd;
	}
	public void setOrgadd(String orgadd) {
		this.orgadd = orgadd;
	}
	
	
}
