package com.sinocat.entity;
/**
 * 产品系统
 * @author 黄立达
 *
 */
public class ProductionSystem  extends BaseEntity{
	private int id;
	private String system;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public ProductionSystem(int id, String system) {
		super();
		this.id = id;
		this.system = system;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}
	@Override
	public String toString() {
		return "ProductionSystem [id=" + id + ", system=" + system + "]";
	}
	public ProductionSystem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
