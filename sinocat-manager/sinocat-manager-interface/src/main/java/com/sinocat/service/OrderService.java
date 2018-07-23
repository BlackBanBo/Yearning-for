package com.sinocat.service;

import java.util.List;

import com.sinocat.entity.Order;

public interface OrderService  {
	/**
	 * 根据订单id获取的订单详细信息
	 * @param orderId
	 * @return 
	 */
	public Order getOrderInfoByOrderId(String orderId);
	/**
	 * 根据用户id获取订单集合
	 * @param UserId
	 * @return
	 */
	public List<Order> getOrderByUserId(String userId);
	/**
	 * 插入订单
	 * @param order 订单信息
	 * @return
	 */
	public boolean insertOrder(Order order);
}
