package com.oldwang.oldwangcrm.model;
/**
 * ��ͬ
 * @author Administrator
 * 
 */
public class Compact {
	/**
	 * ��ͬ��id
	 */
	private int id;
	/**
	 * ҵ��Ա��FK�û���
	 */
	private int usersid;
	/**
	 * �ͻ���FK�ͻ���
	 */
	private int customerid;
	/**
	 * ��Դ
	 */
	private int houselnfoid;
	/**
	 * ���ڣ�����Ϊ��λ��
	 */
	private int hiretime;
	/**
	 * �ɽ��ܼ۸�
	 */
	private int price;
	/**
	 * ���ڣ�ǩԼʱ�䣩
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
