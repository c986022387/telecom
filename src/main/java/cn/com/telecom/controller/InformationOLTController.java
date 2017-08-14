package cn.com.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.com.telecom.domain.InformationOLT;
import cn.com.telecom.service.InformationOLTService;

@RestController
@RequestMapping("olt")
public class InformationOLTController {
	
	@Autowired
	private InformationOLTService InformationOLTService;
	
	@RequestMapping(value = "info")
	public Page<InformationOLT> info(@RequestParam Integer pageIndex, @RequestParam String ascOrDesc, @RequestParam Integer pageSize, @RequestParam String olt){
		return this.InformationOLTService.pageAll(ascOrDesc, pageIndex, pageSize, olt);
	}
	
}