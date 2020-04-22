package com.practice.springaop.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

	private String name;
	private String serviceCode;

	public String getName() {
		System.out.println(getClass() + "Calling get Name method of AccountDAO");
		return name;
	}

	public void setName(String name) {
		System.out.println(getClass() + "Calling set Name method of AccountDAO");
		this.name = name;
	}

	public String getServiceCode() {
		System.out.println(getClass() + "Calling get Service method of AccountDAO");
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() + "Calling set Service method of AccountDAO");
		this.serviceCode = serviceCode;
	}

	public void addAccount(Account account, boolean var) {
		System.out.println(getClass() + "Add Account using DB Call");
	}
}
