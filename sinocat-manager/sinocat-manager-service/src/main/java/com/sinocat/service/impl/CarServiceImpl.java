/**
 * 
 */
package com.sinocat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializer;

import com.sinocat.entity.Car;
import com.sinocat.mapper.CarMapper;
import com.sinocat.service.CarService;

/**
 * TODO
 *  
 * 
 * @author Apeng
 *
 *         2018年7月19日 下午12:55:15
 */

public class CarServiceImpl implements CarService {
	@Autowired
	private CarMapper carMapper;
	@Autowired
	private RedisTemplate<Object, Object> redisTemplate;

	private RedisSerializer<String> redisSerializer = new Jackson2JsonRedisSerializer<>(String.class);

	public CarMapper getCarMapper() {
		return carMapper;
	}

	public void setCarMapper(CarMapper carMapper) {
		this.carMapper = carMapper;
	}

	@Override
	public List<Car> getAllCars() {
		//序列化
		redisTemplate.setKeySerializer(redisSerializer);
		//redisTemplate.setValueSerializer(redisSerializer);
		//查询redis是否已经存在这个key的值
		List<Car> cars = (List<Car>) redisTemplate.opsForValue().get("Cars");

		if (cars == null) {
			synchronized (this) {
				cars = (List<Car>) redisTemplate.opsForValue().get("Cars");
				if (cars == null) {
					cars = carMapper.findAll();
					redisTemplate.opsForValue().set("Cars", cars);
				}
			}
		}

		return cars;
	}

	/*
	 * （非 Javadoc）
	 * 
	 * @see com.sinocat.service.CarService#getCarsByParentId(int)
	 */
	@Override
	public List<Car> getCarsByParentId(int parent_id) {
		// TODO 自动生成的方法存根
		return carMapper.findByParentId(parent_id);
	}

}
