package com.sinocat.entity;
/**
 * 地址
 * @author 黄立达
 *
 */

import javax.jws.soap.SOAPBinding.Use;
/**
 * 地址信息
 * @author 黄立达
 *
 */
public class  Address  extends BaseEntity{
	private int id;
	private String address;
	private User user;
	private boolean type;
	
	
	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public Address(int id, String address, User user, boolean type) {
		super();
		this.id = id;
		this.address = address;
		this.user = user;
		this.type = type;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + ", user=" + user + ", type=" + type + "]";
	}



	
}
