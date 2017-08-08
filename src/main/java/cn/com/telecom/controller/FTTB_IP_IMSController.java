package cn.com.telecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.telecom.domain.FTTB_IP_IMS;
import cn.com.telecom.service.FTTB_IP_IMSService;

@RestController
@RequestMapping("/FTTB_IP_IMSController")
public class FTTB_IP_IMSController {
	
	@Autowired
	private FTTB_IP_IMSService fttb_IP_IMSService;
	
	@RequestMapping(name = "/getAll")
	public List<FTTB_IP_IMS> getAll(){
		List<FTTB_IP_IMS> list = this.fttb_IP_IMSService.getAll();
		System.out.println(list);
		return list;
	}
	
}