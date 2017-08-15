package cn.com.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.com.telecom.domain.CongestionDetailOfUpLink;
import cn.com.telecom.service.CongestionDetailOfUpLinkService;

@RestController
@RequestMapping("/congestionDetailOfUpLink")
public class CongestionDetailOfUpLinkController {
	
	@Autowired
	private CongestionDetailOfUpLinkService congestionDetailOfUpLinkService;
	
	@RequestMapping(value = "/info")
	public Page<CongestionDetailOfUpLink> pageAll(String ascOrDesc, Integer pageIndex, Integer pageSize, Float maximumBandwidthRatio_In, Float maximumBandwidthRatio_Out){
		System.out.println(maximumBandwidthRatio_In);
		System.out.println(maximumBandwidthRatio_Out);
		return this.congestionDetailOfUpLinkService.pageAllByMutiple(ascOrDesc, pageIndex, pageSize, maximumBandwidthRatio_Out, maximumBandwidthRatio_In);
	}
	
}
