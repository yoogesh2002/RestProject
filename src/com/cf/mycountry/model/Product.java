package com.cf.mycountry.model;

import java.util.ArrayList;
import java.util.List;

public class Product {
	
	
	private String productId;
	private String productName;
	private String description;
	private String ImagePath;
	private boolean featured;
	private double price;
	private List<PurchaseItem> purchaseitem = new ArrayList<PurchaseItem>();
	private Catagory catagory;
	
	
	public Product() 
	{
		super();

	}
	
	
	public Product(String productId, String productName, String description, String imagePath, boolean featured,
			double price, List<PurchaseItem> purchaseitem, Catagory catagory) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		ImagePath = imagePath;
		this.featured = featured;
		this.price = price;
		this.purchaseitem = purchaseitem;
		this.catagory = catagory;
	}


	public String getProductId() {
		return productId;
	}


	public void setProductId(String productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getImagePath() {
		return ImagePath;
	}


	public void setImagePath(String imagePath) {
		ImagePath = imagePath;
	}


	public boolean isFeatured() {
		return featured;
	}


	public void setFeatured(boolean featured) {
		this.featured = featured;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public List<PurchaseItem> getPurchaseitem() {
		return purchaseitem;
	}


	public void setPurchaseitem(List<PurchaseItem> purchaseitem) {
		this.purchaseitem = purchaseitem;
	}


	public Catagory getCatagory() {
		return catagory;
	}


	public void setCatagory(Catagory catagory) {
		this.catagory = catagory;
	}
	
	
	
	
	

}
