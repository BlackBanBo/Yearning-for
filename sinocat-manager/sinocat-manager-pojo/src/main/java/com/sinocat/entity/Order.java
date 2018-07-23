package com.sinocat.entity;

import java.util.List;

import javax.jws.soap.SOAPBinding.Use;

import sun.reflect.generics.tree.BaseType;
import sun.reflect.generics.visitor.TypeTreeVisitor;
/**
 * 订单
 * @author 黄立达
 *
 */
public class Order extends BaseEntity{
	private String id;
	private float totalPrice;
	//private int address_id;
	//private String user_id;
	private Address address;
	private User user;
	private List<ProdunctionOrderRelation> productionList;


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
//	public String getUser_id() {
//		return user_id;
//	}
//	public void setUser_id(String user_id) {
//		this.user_id = user_id;
//	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalprice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	

	@Override
	public String toString() {
		return "Order [id=" + id + ", totalPrice=" + totalPrice + ", address=" + address + ", user=" + user
				+ ", productionList=" + productionList + "]";
	}
	public List<ProdunctionOrderRelation> getProductionList() {
	return productionList;
}
public void setProductionList(List<ProdunctionOrderRelation> productionList) {
	this.productionList = productionList;
}
public void setTotalPrice(float totalPrice) {
	this.totalPrice = totalPrice;
}
	//	public int getAddress_id() {
//		return address_id;
//	}
//	public void setAddress_id(int address_id) {
//		this.address_id = address_id;
//	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
