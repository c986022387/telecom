package cn.com.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.com.telecom.domain.FTTB_IP_NGN;
import cn.com.telecom.service.FTTB_IP_NGNService;

@RestController
@RequestMapping("/FTTB_IP_NGNController")
public class FTTB_IP_NGNController {
	
	@Autowired
	private FTTB_IP_NGNService FTTB_IP_NGNService;
	
	@RequestMapping(name = "/info")
	public Page<FTTB_IP_NGN> info(@RequestParam Integer pageIndex, @RequestParam String ascOrDesc, @RequestParam Integer pageSize, @RequestParam String olt){
		return this.FTTB_IP_NGNService.pageAll(ascOrDesc, pageIndex, pageSize, olt);
	}
	
}