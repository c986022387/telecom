package cn.com.telecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.com.telecom.domain.InformationOfTerminal;
import cn.com.telecom.service.InformationOfTerminalService;

@RestController 
@RequestMapping("informationOfTerminal")
public class InformationOfTerminalController {
	
	@Autowired
	private InformationOfTerminalService informationOfTerminalService;
	
	
	@RequestMapping(value = "info")
	public Page<InformationOfTerminal> info(@RequestParam String ascOrDesc, @RequestParam Integer pageIndex, @RequestParam Integer pageSize, @RequestParam String logicID, @RequestParam String terminalUniqueIdentifier, @RequestParam String typeNumber, @RequestParam String versionOfSoftware ){
		
		return this.informationOfTerminalService.pageAll(ascOrDesc, pageIndex, pageSize, logicID, terminalUniqueIdentifier, typeNumber, versionOfSoftware);
	}
	
}
