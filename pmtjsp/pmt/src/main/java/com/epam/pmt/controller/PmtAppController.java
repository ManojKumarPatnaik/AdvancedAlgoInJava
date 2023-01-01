package com.epam.pmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PmtAppController {
	
	@GetMapping("")
	@ResponseBody
	public String home() {
		return "welcome";
	}
	


}
