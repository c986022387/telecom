package cn.com.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.com.telecom.domain.InformationONU;
import cn.com.telecom.service.InformationONUService;

@RestController
@RequestMapping("infotmationONU")
public class InformationONUController {
	
	@Autowired
	private InformationONUService informationONUService;
	
	/**
	 * 根据参数获得信息
	 * @param name 设备名称
	 * @param ONUVoiceIP 语音IP
	 * @param SSnodeID ss节点
	 * @param pageIndex	页码
	 * @return
	 */
	@RequestMapping("info")
	public Page<InformationONU> info(@RequestParam String name, @RequestParam String ONUVoiceIP, @RequestParam String SSnodeID, @RequestParam String ascOrDesc, @RequestParam Integer pageIndex) {
		System.out.println(name);
		System.out.println(ONUVoiceIP);
		System.out.println(SSnodeID);
		System.out.println(ascOrDesc);
		return this.informationONUService.pageAllByMultiple(name, ONUVoiceIP, SSnodeID, ascOrDesc, pageIndex, 10);
	}
	
}
