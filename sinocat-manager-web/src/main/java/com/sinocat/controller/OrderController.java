package com.sinocat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinocat.entity.Order;
import com.sinocat.service.OrderService;

@Controller
@RequestMapping("/OrderController")
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@ResponseBody
	@RequestMapping("getOrderInfoByOrderId.action")
	public Order getOrderInfoByOrderId(String orderId) {
		Order order = orderService.getOrderInfoByOrderId(orderId);
		System.out.println("order"+order);
		return order;
		
	}
	@ResponseBody
	@RequestMapping("getOrderByUserId.action")
	public List<Order> getOrderByUserId(String userId) {
		List<Order> list = orderService.getOrderByUserId(userId);
		System.out.println("orderlist:"+list);

		return list;
		
	}
	@ResponseBody
	@RequestMapping("insertOrder.action")
	public Order getOrderByUserId(@RequestBody Order order) {
		boolean list = orderService.insertOrder(order);
		System.out.println("orderlist:"+order);
		
		return order;
		
	}
}
