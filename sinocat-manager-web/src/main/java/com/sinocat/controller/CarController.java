/**
 * 
 */
package com.sinocat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinocat.entity.Car;
import com.sinocat.service.CarService;

/**
 * TODO
 * 
 * 
 * @author Apeng
 *
 * 2018年7月19日 下午12:53:24 
 */

@Controller
public class CarController {
	@Autowired
	private CarService carService;

	public CarService getCarService() {
		return carService;
	}

	public void setCarService(CarService carService) {
		this.carService = carService;
	}
	/**
	 * 
	 * TODO
	 * 获取所有的汽车信息
	 * 
	 * @author Apeng
	 *
	 * 2018年7月19日 下午2:52:27
	 */
	@ResponseBody
	@RequestMapping("/getAllCars.action")
	public List<Car> getAllCars(){
		return carService.getAllCars();
	}
	
	/**
	 * 
	 * TODO
	 * 获取父级id下的所有子车型
	 * 
	 * @author Apeng
	 *
	 * 2018年7月19日 下午2:52:27
	 */
	@ResponseBody
	@RequestMapping("/getCarsByParentId.action")
	public List<Car> getCarsByParentId(int parent_id) {
		List<Car> cars = carService.getCarsByParentId(parent_id);
		return cars;
	}
	
	
	
	
	
	
	
}
