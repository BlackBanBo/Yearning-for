package com.sinocat.entity;

/**
 * 车型实体类
 * c_id  主键id
 * parent_id  父级车型id
 * c_type  车型名称
 * c_discharge  排量
 * @author Apeng
 * @date 2018.7.19 11:57
 *
 */

public class Car extends BaseEntity{
	private int c_id;
	private int parent_id;
	private String c_type;
	private String c_discharge;
	public Car() {
		super();
		// TODO 自动生成的构造函数存根
	}
	public Car(int c_id, int parent_id, String c_type, String c_discharge) {
		super();
		this.c_id = c_id;
		this.parent_id = parent_id;
		this.c_type = c_type;
		this.c_discharge = c_discharge;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	public String getC_type() {
		return c_type;
	}
	public void setC_type(String c_type) {
		this.c_type = c_type;
	}
	public String getC_discharge() {
		return c_discharge;
	}
	public void setC_discharge(String c_discharge) {
		this.c_discharge = c_discharge;
	}
	@Override
	public String toString() {
		return "Car [c_id=" + c_id + ", parent_id=" + parent_id + ", c_type=" + c_type + ", c_discharge=" + c_discharge
				+ "]";
	}
	
	
}
