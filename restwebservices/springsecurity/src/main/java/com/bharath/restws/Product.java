package com.bharath.restws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="product")
public class Product {
	
	private long id;
	private String description;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
