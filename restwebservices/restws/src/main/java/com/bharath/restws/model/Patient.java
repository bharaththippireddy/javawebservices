package com.bharath.restws.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Patient")
public class Patient {
	
	private long id;
	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
