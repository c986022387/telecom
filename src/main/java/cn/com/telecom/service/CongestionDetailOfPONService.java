package cn.com.telecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.telecom.domain.CongestionDetailOfPON;
import cn.com.telecom.repository.CongestionDetailOfPONRepository;

@Service
public class CongestionDetailOfPONService {
	
	@Autowired
	private CongestionDetailOfPONRepository congestionDetailOfPONRepository;
	
	public List<CongestionDetailOfPON> getAll(){
		return  this.congestionDetailOfPONRepository.findAll();
	}
	
}
