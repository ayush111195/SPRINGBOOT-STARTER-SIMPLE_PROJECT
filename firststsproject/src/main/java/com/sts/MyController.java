package com.sts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MyController {

	@RequestMapping("/test")
	public String mySts() {
		return "just for testing!!!";
		
	}
}
