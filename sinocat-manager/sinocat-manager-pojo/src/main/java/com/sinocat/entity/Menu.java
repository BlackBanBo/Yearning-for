package com.sinocat.entity;

/*
 * 菜单实体类
 * */
public class Menu extends BaseEntity {
	//菜单id
	private int m_id;
	//菜单名
	private String m_name;
	//菜单父id
	private int m_parentid;
	//菜单url
	private String m_url;
	public int getM_id() {
		return m_id;
	}
	public void setM_id(int m_id) {
		this.m_id = m_id;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public int getM_parentid() {
		return m_parentid;
	}
	public void setM_parentid(int m_parentid) {
		this.m_parentid = m_parentid;
	}
	public String getM_url() {
		return m_url;
	}
	public void setM_url(String m_url) {
		this.m_url = m_url;
	}
	public Menu(int m_id, String m_name, int m_parentid, String m_url) {
		super();
		this.m_id = m_id;
		this.m_name = m_name;
		this.m_parentid = m_parentid;
		this.m_url = m_url;
	}
	public Menu() {
		super();
		// TODO 自动生成的构造函数存根
	}
	@Override
	public String toString() {
		return "Menu [m_id=" + m_id + ", m_name=" + m_name + ", m_parentid=" + m_parentid + ", m_url=" + m_url + "]";
	}
}
