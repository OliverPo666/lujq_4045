package com.lujq.lujq_Assignment0;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class lujqController {
	
	@RequestMapping("/start")
	public String start() {
		return "start";
	}
	
}
