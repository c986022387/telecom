package cn.com.telecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.com.telecom.domain.InformationOfTerminal;
import cn.com.telecom.domain.Items;
import cn.com.telecom.service.InformationOfTerminalService;

@RestController
@RequestMapping("InformationOfTerminalController")
@Transactional
public class InformationOfTerminalController {
	
	@Autowired
	private InformationOfTerminalService informationOfTerminalService;
	
	@RequestMapping(name = "/getAll")
	public List<InformationOfTerminal> getAll(){
		List<InformationOfTerminal> list = this.informationOfTerminalService.getAll();
		System.out.println(list);
		return list;
	}
	
	@RequestMapping(name = "/pageAll")
	public Items<InformationOfTerminal> pageAll(@RequestParam String ascOrDesc, @RequestParam String orderBy, @RequestParam Integer pageIndex, @RequestParam Integer pageSize ){
		return this.informationOfTerminalService.findAll(ascOrDesc,  pageIndex, pageSize);
	}
	
}
