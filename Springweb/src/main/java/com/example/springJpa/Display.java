package com.example.springJpa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Display {

	@ResponseBody
	@RequestMapping("display")
	public String display() {
		return "Hi Naveen";

	}
}
