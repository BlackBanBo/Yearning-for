package com.sinocat.entity;

import java.io.Serializable;

/**
 * api类，提供通用功能模块 这里定义的一个User实体类
 * 
 * @author Garen
 *
 */

public class User implements Serializable{
	private String u_id;
	
	private String u_password;
	
	private String u_name;
	
	private String u_weuxin_key;
	
	private Integer a_id;
	
	private String u_phone;

	public String getU_id() {
		return u_id;
	}

	public void setU_id(String u_id) {
		this.u_id = u_id;
	}

	public String getU_password() {
		return u_password;
	}

	public void setU_password(String u_password) {
		this.u_password = u_password;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_weuxin_key() {
		return u_weuxin_key;
	}

	public void setU_weuxin_key(String u_weuxin_key) {
		this.u_weuxin_key = u_weuxin_key;
	}

	public Integer getA_id() {
		return a_id;
	}

	public void setA_id(Integer a_id) {
		this.a_id = a_id;
	}

	public String getU_phone() {
		return u_phone;
	}

	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}

	public User(String u_id, String u_password, String u_name, String u_weuxin_key, Integer a_id, String u_phone) {
		super();
		this.u_id = u_id;
		this.u_password = u_password;
		this.u_name = u_name;
		this.u_weuxin_key = u_weuxin_key;
		this.a_id = a_id;
		this.u_phone = u_phone;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_password=" + u_password + ", u_name=" + u_name + ", u_weuxin_key="
				+ u_weuxin_key + ", a_id=" + a_id + ", u_phone=" + u_phone + "]";
	}

	
}
