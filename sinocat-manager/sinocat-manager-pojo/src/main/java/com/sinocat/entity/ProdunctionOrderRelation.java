package com.sinocat.entity;
/**
 * 订单中的商品关系
 * @author 黄立达
 *
 */
public class ProdunctionOrderRelation extends BaseEntity {

	private int id;	
	//private int production_id;
	private int num;
	private Production production;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

//	public int getProduction_id() {
//		return production_id;
//	}
//	public void setProduction_id(int production_id) {
//		this.production_id = production_id;
//	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Production getProduction() {
		return production;
	}
	public void setProduction(Production production) {
		this.production = production;
	}

	@Override
	public String toString() {
		return "ProdunctionOrderRelation [id=" + id +  ", production_id="+ ", num=" + num + ", production=" + production + ", order=" + "]";
	}

	public ProdunctionOrderRelation(int id,int num, Production production
		) {
		super();
		this.id = id;
		
	
		this.num = num;
		this.production = production;

	}
	public ProdunctionOrderRelation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
