package com.cf.mycountry.model;

import java.util.ArrayList;
import java.util.List;

public class Catagory {
	
	private String CatagoryId;
	private String CatagoryName;
	private String Description;
	private List<Product> product = new ArrayList<Product>();
	
	
	public Catagory() 
	{
		super();
	}


	public Catagory(String catagoryId, String catagoryName, String description, List<Product> product) {
		super();
		CatagoryId = catagoryId;
		CatagoryName = catagoryName;
		Description = description;
		this.product = product;
	}


	public String getCatagoryId() {
		return CatagoryId;
	}


	public void setCatagoryId(String catagoryId) {
		CatagoryId = catagoryId;
	}


	public String getCatagoryName() {
		return CatagoryName;
	}


	public void setCatagoryName(String catagoryName) {
		CatagoryName = catagoryName;
	}


	public String getDescription() {
		return Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public List<Product> getProduct() {
		return product;
	}


	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	
}
