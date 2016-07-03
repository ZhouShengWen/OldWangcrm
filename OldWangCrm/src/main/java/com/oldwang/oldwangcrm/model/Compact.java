package com.oldwang.oldwangcrm.model;

/**
 * 合同实体类
 * @author Administrator
 * 
 */
public class Compact {
	/**
	 * 合同编号id
	 */
	private int id;
	/**
	 * 业务员（FK用户表）
	 */
	private int usersid;
	/**
	 * 客户（FK客户表）
	 */
	private int customerid;
	/**
	 * 房源（FK房源）
	 */
	private int houselnfoid;
	/**
	 *租期（以月为单位） 
	 */
	private int hiretime;
	/**
	 * 成交价格
	 */
	private int price;
	/**
	 * 日期（签约时间）
	 */
	private String date;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the usersid
	 */
	public int getUsersid() {
		return usersid;
	}
	/**
	 * @param usersid the usersid to set
	 */
	public void setUsersid(int usersid) {
		this.usersid = usersid;
	}
	/**
	 * @return the customerid
	 */
	public int getCustomerid() {
		return customerid;
	}
	/**
	 * @param customerid the customerid to set
	 */
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	/**
	 * @return the houselnfoid
	 */
	public int getHouselnfoid() {
		return houselnfoid;
	}
	/**
	 * @param houselnfoid the houselnfoid to set
	 */
	public void setHouselnfoid(int houselnfoid) {
		this.houselnfoid = houselnfoid;
	}
	/**
	 * @return the hiretime
	 */
	public int getHiretime() {
		return hiretime;
	}
	/**
	 * @param hiretime the hiretime to set
	 */
	public void setHiretime(int hiretime) {
		this.hiretime = hiretime;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	
}
