package com.sinocat.entity;

public class Production  extends BaseEntity{
	private int id;
	private String name;
	private float price;
	private String image;
	private String content;
	//private String pt_id;
	private float weight;
//	private int ps_id;
	private ProductionSystem productionSystem;
	private ProductionType productionType;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
//	public String getPt_id() {
//		return pt_id;
//	}
//	public void setPt_id(String pt_id) {
//		this.pt_id = pt_id;
//	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
//	public int getPs_id() {
//		return ps_id;
//	}
//	public void setPs_id(int ps_id) {
//		this.ps_id = ps_id;
//	}
	

	@Override
	public String toString() {
		return "Production [id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + ", content="
				+ content + ", weight=" + weight +  ", productionSystem="
				+ productionSystem + ", productionType=" + productionType + "]";
	}
	public Production(int id, String name, float price, String image, String content,  float weight,
			ProductionSystem productionSystem, ProductionType productionType) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.image = image;
		this.content = content;
		
		this.weight = weight;

		this.productionSystem = productionSystem;
		this.productionType = productionType;
	}
	public Production() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
