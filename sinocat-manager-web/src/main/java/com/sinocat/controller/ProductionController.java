package com.sinocat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinocat.entity.Production;
import com.sinocat.service.ProductionService;

@Controller
@RequestMapping("/ProductionController")
public class ProductionController {
	@Autowired
	  ProductionService productionService;
	@ResponseBody
	@RequestMapping("getProductionList.action")
	public List<Production> getProductionList(int index,int pageSize){
		List<Production>  list = productionService.getProductionList(index,pageSize);
		return list;			
	}
	@ResponseBody
	@RequestMapping("getProductionListByCarId.action")
	public List<Production> getProdutionListByCarId(int carId){
		List<Production>  list = productionService.getProdutionListByCarId(carId);

		return list;
		
	}
	
	@ResponseBody
	@RequestMapping("getProductionByProductionId.action")
	public Production getProductionByProductionId(int productionId){
		Production production = productionService.getProductionByProductionId(productionId);
		return production;
		
	}
	
	@ResponseBody
	@RequestMapping("getProductionByProductionIdList.action")
	public List<Production> getProductionByProductionIdList(List<Integer> Idlist){
		List<Production>  list  = productionService.getProductionByProductionIdList(Idlist);
		return list;
		
	}
}	
