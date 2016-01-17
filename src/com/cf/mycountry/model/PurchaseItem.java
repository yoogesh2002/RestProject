package com.cf.mycountry.model;

import java.util.Date;

public class PurchaseItem {
	
	private String purchaseItemId;
	private Date orderDate;
	private int quantity;
	private int purchaseVersion;
	private Purchase purchase;
	private Product product;
	
	
	public PurchaseItem() 
	{
		super();
	}


	public PurchaseItem(String purchaseItemId, Date orderDate, int quantity, int purchaseVersion, Purchase purchase,
			Product product) {
		super();
		this.purchaseItemId = purchaseItemId;
		this.orderDate = orderDate;
		this.quantity = quantity;
		this.purchaseVersion = purchaseVersion;
		this.purchase = purchase;
		this.product = product;
	}


	public String getPurchaseItemId() {
		return purchaseItemId;
	}


	public void setPurchaseItemId(String purchaseItemId) {
		this.purchaseItemId = purchaseItemId;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public int getPurchaseVersion() {
		return purchaseVersion;
	}


	public void setPurchaseVersion(int purchaseVersion) {
		this.purchaseVersion = purchaseVersion;
	}


	public Purchase getPurchase() {
		return purchase;
	}


	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
