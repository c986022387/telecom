package cn.com.telecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.telecom.domain.CongestionDetailOfPON;
import cn.com.telecom.service.CongestionDetailOfPONService;

@RestController
@RequestMapping("/CongestionDetailOfPON")
public class CongestionDetailOfPONController {
	
	@Autowired
	private CongestionDetailOfPONService congestionDetailOfPONService;
	
	@RequestMapping(name = "/getAll")
	public List<CongestionDetailOfPON> getAll(){
		List<CongestionDetailOfPON> list = this.congestionDetailOfPONService.getAll();
		System.out.println(list);
		return list;
	}
	
}
