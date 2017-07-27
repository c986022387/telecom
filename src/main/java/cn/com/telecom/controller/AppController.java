package cn.com.telecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class AppController {
	
	@RequestMapping("/")
	public String index() {
		return "redirect:index";
	}
	
	@RequestMapping("/index")
	public String indexPage() {
		return "index";
	}
	
}
