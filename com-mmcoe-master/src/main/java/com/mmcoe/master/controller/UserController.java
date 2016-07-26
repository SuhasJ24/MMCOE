package com.mmcoe.master.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@RequestMapping(value="/details", method={RequestMethod.GET},produces={"application/json","application/xml"})
	@ResponseBody
	public Map<String,Object> getUserDetails(){
		Map<String, Object> user = new HashMap<String, Object>();
		user.put("user","Suhas");
		return user;
	}
}
