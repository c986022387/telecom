package cn.com.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.com.telecom.domain.InformationFTTH_IP;
import cn.com.telecom.service.InformationFTTH_IPService;

@RestController
@RequestMapping("ftth")
public class InformationFTTH_IPController {
	
	@Autowired
	private InformationFTTH_IPService InformationFTTH_IPService;
	
	@RequestMapping(value = "info")
	public Page<InformationFTTH_IP> info(@RequestParam Integer pageIndex, @RequestParam String ascOrDesc, @RequestParam Integer pageSize, @RequestParam String olt){
		return this.InformationFTTH_IPService.pageAll(ascOrDesc, pageIndex, pageSize, olt);
	}
	
}