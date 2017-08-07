package cn.com.telecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.com.telecom.domain.InformationOfTerminal;
import cn.com.telecom.domain.Items;
import cn.com.telecom.repository.InformationOfTerminalRepository;
import cn.com.telecom.util.Utils;

@Service
public class InformationOfTerminalService {
	
	
	@Autowired
	private InformationOfTerminalRepository informationOfTerminalRepository;
	
	public List<InformationOfTerminal> getAll(){
		return  this.informationOfTerminalRepository.findAll();
	}
	
	/**
	 * 
	 * @param ascOrDesc 升序还是降序
	 * @param orderBy 要排序的字段
	 * @param pageIndex 页码
	 * @param pageSize 每页数量
	 * @return
	 */
	public Items<InformationOfTerminal> findAll(String ascOrDesc, Integer pageIndex, Integer pageSize){
		Items<InformationOfTerminal> items = getItems(ascOrDesc, pageIndex, pageSize);
		return items;
	}

	
	/**
	 * 封装Items
	 * @param ascOrDesc
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	private Items<InformationOfTerminal> getItems(String ascOrDesc, Integer pageIndex, Integer pageSize) {
		Items<InformationOfTerminal> items = new Items<InformationOfTerminal>();
		items.setPageIndex(pageIndex);
		items.setPageSize(pageSize);
		items.setT(informationOfTerminalRepository.findAll(Utils.getPageRequest(ascOrDesc, "id", pageIndex, pageSize)));
		return items;
	}
	
}
