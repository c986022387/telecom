package cn.com.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.telecom.domain.CongestionDetailOfPON;
import cn.com.telecom.service.CongestionDetailOfPONService;

@RestController
@RequestMapping("/congestionDetailOfPON")
public class CongestionDetailOfPONController {
	
	@Autowired
	private CongestionDetailOfPONService congestionDetailOfPONService;
	
	@RequestMapping(value = "/info")
	public Page<CongestionDetailOfPON> pageAll(String ascOrDesc, Integer pageIndex, Integer pageSize, Float maximumBandwidthRatio_In, Float maximumBandwidthRatio_Out){
		System.out.println(maximumBandwidthRatio_In);
		System.out.println(maximumBandwidthRatio_Out);
		return this.congestionDetailOfPONService.pageAllByMutiple(ascOrDesc, pageIndex, pageSize, maximumBandwidthRatio_Out, maximumBandwidthRatio_In);
	}
	
}
