	package com.sinocat.mapper;



import java.util.List;

import com.sinocat.entity.Production;

public interface ProductionMapper {
	/**
	 * 获取产品基本信息列表
	 * @return
	 */
	public List<Production> getProductionList();
	/**
	 * 根据汽车id获取相应产品表
	 * @return
	 */
	public List<Production> getProdutionListByCarId(int carId);
	/**
	 * 根据产品id获取产品详细信息
	 * @param id
	 * @return 
	 */
	public Production getProdutionInfoByProductionId(int productionId);
	/**
	 * 根据产品id获取产品信息
	 * @param productionIdList
	 * @return
	 */
	public  List<Production> getProdutionByProductionIdList(List<Integer> idList);
	
}
