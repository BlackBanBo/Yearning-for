package com.sinocat.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.sinocat.entity.Order;
import com.sinocat.mapper.OrderMapper;
import com.sinocat.service.OrderService;
@Service
public class OrderServiceImp implements OrderService{
	@Autowired
	OrderMapper orderMapper;
	@Override
	public Order getOrderInfoByOrderId(String orderId) {
		Order order =orderMapper.getOrderInfoByOrderId(orderId);
		
		return order;
	}

	@Override
	public List<Order> getOrderByUserId(String userId) {
		List<Order> list = orderMapper.getOrderByUserId(userId);
		return list;
	}

	@Override
	public boolean insertOrder(Order order) {
		System.out.println("还没有插入数据......");
		return false;
	}

}
