package cn.com.telecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.telecom.domain.InformationOfTerminal;
import cn.com.telecom.repository.InformationOfTerminalRepository;

@Service
public class InformationOfTerminalService {
	
	
	@Autowired
	private InformationOfTerminalRepository informationOfTerminalRepository;
	
	public List<InformationOfTerminal> getAll(){
		return  this.informationOfTerminalRepository.findAll();
	}
	
}
