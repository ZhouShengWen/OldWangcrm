package com.oldwang.oldwangcrm.model;


/**
 * ������¼
 * 
 * @author Administrator
 * 
 */
public class Work {
	/**
	 * ������¼id
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
	 * ��Դ��FK��Դ��
	 */
	private int houselnfoid;
	/**
	 * ʱ��
	 */
	private String date;
	/**
	 * ��� 0���� 1���⵫δ�ɽ� 2�ɽ�
	 */
	private String result;
	/**
	 * ��ע
	 */
	private String remark;
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
	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
