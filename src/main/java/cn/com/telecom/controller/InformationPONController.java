package cn.com.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.com.telecom.domain.InformationPON;
import cn.com.telecom.service.InformationPONService;

@RestController
@RequestMapping("pon")
public class InformationPONController {
	
	@Autowired
	private InformationPONService InformationPONService;
	
	@RequestMapping(value = "info")
	public Page<InformationPON> info(@RequestParam Integer pageIndex, @RequestParam String ascOrDesc, @RequestParam Integer pageSize, @RequestParam String deviceName, @RequestParam String sVlan){
		return this.InformationPONService.pageAll(ascOrDesc, pageIndex, pageSize, deviceName, sVlan);
	}
	
}