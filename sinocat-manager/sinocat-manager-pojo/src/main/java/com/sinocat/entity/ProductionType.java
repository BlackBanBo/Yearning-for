package com.sinocat.entity;
/**
 *产品类型
 * @author 黄立达
 *
 */
public class ProductionType  extends BaseEntity {
	private int id;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "ProductionType [id=" + id + ", type=" + type + "]";
	}
	public ProductionType(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	public ProductionType() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
