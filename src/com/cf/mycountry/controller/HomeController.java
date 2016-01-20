package com.cf.mycountry.controller;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import oracle.jdbc.pool.OracleDataSource;

@Controller
public class HomeController {
	
	


	@Autowired
	private OracleDataSource datasource;
	
	
	public OracleDataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(OracleDataSource datasource) {
		this.datasource = datasource;
	}
	
	@RequestMapping("/")
	public String home()
	{
		try {
			Connection con = datasource.getConnection();
			System.out.println("Connection successful");
		} catch (SQLException e) {
			
			System.out.println("Sorry!!! could not connect to oracle!!!");
		}
		
		
		return "home";
	}
	
	

	

}