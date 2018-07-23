package com.sinocat.service;

import java.util.List;

import com.sinocat.entity.Production;

public interface  ProductionService{
	/**
	 * 获取汽车列表
	 * @param index 页码
	 * @param pageSize 每页条数
	 * @return
	 */
 	public List<Production> getProductionList(int index,int pageSize);
 	/**
 	 * 根据汽车名获取产品列表
 	 * @param carId
 	 * @return
 	 */
 	public List<Production> getProdutionListByCarId(int carId);
 	/**
 	 * 根据产品id获取详细产品信息
 	 * @param 
 	 * @return
 	 */
 	public Production getProductionByProductionId(int productionId);
 	/**
 	 * 根据产品id表获取产品信息
 	 * @param Idlist
 	 * @return
 	 */
 	public List<Production> getProductionByProductionIdList(List<Integer> IdList);
}
