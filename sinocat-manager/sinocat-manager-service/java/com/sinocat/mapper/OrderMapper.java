package com.sinocat.mapper;

import java.util.List;

import com.sinocat.entity.Order;

public interface OrderMapper {
	/**
	 * 添加一个订单(存储过程?还未写)
	 * @param order
	 */
	public void addOrder(Order order);
	/**
	 * 根据uerId返回订单列表
	 * @param UserId  
	 * @return 
	 */
	public List<Order> getOrderByUserId(String userId);
	/**
	 * 获取订单详细信息
	 * @param orderId
	 * @return
	 */
	public Order getOrderInfoByOrderId(String orderId);
	/**
	 * 删除订单(存储过程？还未写)
	 * @return
	 */
	public Order deleteOrderByOrderId(String OrderId);
	
	
}
