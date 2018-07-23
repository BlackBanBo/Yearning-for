/**
 * 
 */
package com.sinocat.mapper;

import java.util.List;

import com.sinocat.entity.Car;



/**
 * TODO
 * CarMapper接口
 * 
 * @author Apeng
 *
 * 2018年7月19日
 */
public interface CarMapper {
	
	public List<Car> findAll();

	/**
	 * TODO
	 * 根据父级Id获取其下所有车型
	 * 
	 * @author Apeng
	 *
	 * 2018年7月19日 下午3:07:08 
	 */
	public List<Car> findByParentId(int parent_id);
}
