package com.cf.mycountry.service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cf.mycountry.model.Student;



@Controller
@RequestMapping("/greetings")
public class RestfulController {
	
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public @ResponseBody Student sayhello()
	{
		Student std = new Student();
		std.setName("Yoogesh");
		std.setRollNo("123");
		return std;
	}
	
	
	
	

}
