package cn.com.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.com.telecom.domain.FTTB_IP_IMS;
import cn.com.telecom.service.FTTB_IP_IMSService;

@RestController
@RequestMapping("/FTTB_IP_IMSController")
public class FTTB_IP_IMSController {
	
	@Autowired
	private FTTB_IP_IMSService fttb_IP_IMSService;
	
	@RequestMapping(name = "/info")
	public Page<FTTB_IP_IMS> info(@RequestParam Integer pageIndex, @RequestParam String ascOrDesc, @RequestParam Integer pageSize, @RequestParam String olt){
		return this.fttb_IP_IMSService.pageAll(ascOrDesc, pageIndex, pageSize, olt);
	}
	
}