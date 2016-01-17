package com.cf.mycountry.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Purchase {
	
	private String purchaseId;
	private Date orderDate;
	private boolean purchaseCompleted;
	private int purchaseVersion;
	private Customer customer;
	private List<PurchaseItem> purchaseitem = new ArrayList<PurchaseItem>();
	
	
	public Purchase() 
	{
		super();
	
	}


	public Purchase(String purchaseId, Date orderDate, boolean purchaseCompleted, int purchaseVersion,
			Customer customer, List<PurchaseItem> purchaseitem) {
		super();
		this.purchaseId = purchaseId;
		this.orderDate = orderDate;
		this.purchaseCompleted = purchaseCompleted;
		this.purchaseVersion = purchaseVersion;
		this.customer = customer;
		this.purchaseitem = purchaseitem;
	}


	public String getPurchaseId() {
		return purchaseId;
	}


	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}


	public boolean isPurchaseCompleted() {
		return purchaseCompleted;
	}


	public void setPurchaseCompleted(boolean purchaseCompleted) {
		this.purchaseCompleted = purchaseCompleted;
	}


	public int getPurchaseVersion() {
		return purchaseVersion;
	}


	public void setPurchaseVersion(int purchaseVersion) {
		this.purchaseVersion = purchaseVersion;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public List<PurchaseItem> getPurchaseitem() {
		return purchaseitem;
	}


	public void setPurchaseitem(List<PurchaseItem> purchaseitem) {
		this.purchaseitem = purchaseitem;
	}
	
	
}
