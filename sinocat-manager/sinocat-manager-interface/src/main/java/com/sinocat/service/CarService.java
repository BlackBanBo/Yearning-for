/**
 * 
 */
package com.sinocat.service;

import java.util.List;

import com.sinocat.entity.Car;

/**
 * TODO
 * 
 * 
 * @author Apeng
 *
 * 2018年7月19日 下午12:53:57 
 */
public interface CarService {
	/**
	 * TODO
	 * 获取所有车型
	 * 
	 * @author Apeng
	 *
	 * 2018年7月19日 下午1:04:27 
	 */
	List<Car> getAllCars();
	
	/**
	 * TODO
	 * 根据父级Id获取属于其下的车型
	 * 
	 * @author Apeng
	 *
	 * 2018年7月19日 下午3:02:43 
	 */
	List<Car> getCarsByParentId(int parent_id);
}
