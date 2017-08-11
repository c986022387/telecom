package cn.com.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.com.telecom.domain.InformationOfTerminal;
import cn.com.telecom.service.InformationOfTerminalService;

@RestController 
@RequestMapping("/informationOfTerminal")
public class InformationOfTerminalController {
	
	@Autowired
	private InformationOfTerminalService informationOfTerminalService;
	
	
	@RequestMapping(value = "/pageAll", method = RequestMethod.GET)
	public Page<InformationOfTerminal> pageAll(@RequestParam String ascOrDesc, @RequestParam Integer pageIndex, @RequestParam Integer pageSize ){
		return this.informationOfTerminalService.findAll(ascOrDesc,  pageIndex, pageSize);
	}
	
}
