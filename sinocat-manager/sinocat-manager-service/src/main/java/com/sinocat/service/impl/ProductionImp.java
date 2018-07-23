package com.sinocat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sinocat.entity.Production;
import com.sinocat.mapper.ProductionMapper;
import com.sinocat.service.ProductionService;
@Component
@Service
public class ProductionImp implements ProductionService {
	@Autowired
	ProductionMapper productionMapper;
		
	@Override
	public List<Production> getProductionList(int index ,int pageSize) {
	
		 PageHelper.startPage(index, pageSize);
		 List<Production> productions = productionMapper.getProductionList();
		return productions;
	}

	@Override
	public List<Production> getProdutionListByCarId(int carId) {
		List<Production> productions = productionMapper.getProdutionListByCarId(carId);
		return productions;
	}

	@Override
	public Production getProductionByProductionId(int productionId) {
		Production production = productionMapper.getProdutionInfoByProductionId(productionId);
		return production;
	}


	@Override
	public List<Production> getProductionByProductionIdList(List<Integer> idList) {
		List<Production> productions = productionMapper.getProdutionByProductionIdList(idList);
		return productions;
	}
	
	

}
