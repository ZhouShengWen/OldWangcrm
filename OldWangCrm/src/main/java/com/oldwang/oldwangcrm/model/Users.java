package com.oldwang.oldwangcrm.model;


/**
 * �û�
 * 
 * @author Administrator
 * 
 */
public class Users {
	/**
	 * �û�id
	 */
	private int id;
	/**
	 * ����
	 */
	private String name;
	/**
	 * ����
	 */
	private String password;
	/**
	 * ��ϵ��ʽ
	 */
	private String phone;
	/**
	 * ���֤
	 */
	private String idcard;
	/**
	 * ����
	 */
	private String storeid;
	/**
	 * �ȼ� 0ҵ��Ա 1�곤 2������
	 */
	private int ulevel;
	/**
	 * ״̬ 0���� 1�ݼ�/���� 2��ְ
	 */
	private int state;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	 * @return the idcard
	 */
	public String getIdcard() {
		return idcard;
	}
	/**
	 * @param idcard the idcard to set
	 */
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	/**
	 * @return the storeid
	 */
	public String getStoreid() {
		return storeid;
	}
	/**
	 * @param storeid the storeid to set
	 */
	public void setStoreid(String storeid) {
		this.storeid = storeid;
	}
	/**
	 * @return the ulevel
	 */
	public int getUlevel() {
		return ulevel;
	}
	/**
	 * @param ulevel the ulevel to set
	 */
	public void setUlevel(int ulevel) {
		this.ulevel = ulevel;
	}
	/**
	 * @return the state
	 */
	public int getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(int state) {
		this.state = state;
	}
	
}
