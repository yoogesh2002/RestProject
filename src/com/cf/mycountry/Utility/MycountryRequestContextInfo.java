package com.cf.mycountry.Utility;

import javax.enterprise.context.RequestScoped;

@RequestScoped
public class MycountryRequestContextInfo {
	
	private String transactionId;
	private String ipAddress;
	private String browserAgent;
	private String triggeredById;
	
	public MycountryRequestContextInfo() {
	
		this.transactionId="";
		this.ipAddress="";
		this.browserAgent="";
		this.triggeredById="";	
	}

	
	public MycountryRequestContextInfo(String transactionId, String ipAddress, String browserAgent,
			String triggeredById) {
		super();
		this.transactionId = transactionId;
		this.ipAddress = ipAddress;
		this.browserAgent = browserAgent;
		this.triggeredById = triggeredById;
	}


	public String getTransactionId() {
		return transactionId;
	}


	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}


	public String getIpAddress() {
		return ipAddress;
	}


	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}


	public String getBrowserAgent() {
		return browserAgent;
	}


	public void setBrowserAgent(String browserAgent) {
		this.browserAgent = browserAgent;
	}


	public String getTriggeredById() {
		return triggeredById;
	}


	public void setTriggeredById(String triggeredById) {
		this.triggeredById = triggeredById;
	}
	

}
