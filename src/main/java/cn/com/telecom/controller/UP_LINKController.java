package cn.com.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.com.telecom.domain.UP_LINK;
import cn.com.telecom.service.UP_LINKService;

@RestController
@RequestMapping("up_link")
public class UP_LINKController {
	
	@Autowired
	private UP_LINKService UP_LINKService;
	
	@RequestMapping(value = "info")
	public Page<UP_LINK> info(@RequestParam Integer pageIndex, @RequestParam String ascOrDesc, @RequestParam Integer pageSize, @RequestParam String oltDeviceName, @RequestParam String serviceName){
		return this.UP_LINKService.pageAll(ascOrDesc, pageIndex, pageSize, oltDeviceName, serviceName);
	}
	
}