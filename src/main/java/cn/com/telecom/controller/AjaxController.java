package cn.com.telecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.telecom.domain.InformationOfTerminal;
import cn.com.telecom.service.AjaxService;

@RestController
@Transactional
public class AjaxController {
	
	@Autowired
	private AjaxService ajaxService;
	
	@RequestMapping(name = "getInformtionOfTerminal")
	public List<InformationOfTerminal> getInformtionOfTerminal(){
		List<InformationOfTerminal> list = this.ajaxService.getAll();
		System.out.println(list);
		return list;
	}
	
}
