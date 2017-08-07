package cn.com.telecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.telecom.domain.FTTB_IP_IMS;
import cn.com.telecom.repository.FTTB_IP_IMSRespository;;

@Service
public class FTTB_IP_IMSService {

	@Autowired
	private FTTB_IP_IMSRespository fttb_IP_IMSRespository;

	public List<FTTB_IP_IMS> getAll() {
		return this.fttb_IP_IMSRespository.findAll();
	}
}
