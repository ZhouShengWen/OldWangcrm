package com.oldwang.oldwangcrm.model;

/**
 * �ͻ���
 * 
 * @author Administrator
 * 
 */
public class Customer {
	/**
	 * �ͻ���id
	 */
	private int id;
	/**
	 * ����
	 */
	private String name;
	/**
	 * ��ϵ��ʽ
	 */
	private String phone;
	/**
	 * ����
	 */
	private String area;
	/**
	 * ������
	 */
	private int housetype;
	/**
	 * ����¥�㣨���ݱ�ʾ��
	 */
	private int floor;
	/**
	 * �۸�
	 */
	private int price;
	/**
	 * ��ʩ
	 */
	private String equipment;
	/**
	 * ״̬ 0û��Ŀ�귿�� 1��Ŀ�귿�ӵ�δ�� 2�Ѿ�����
	 */
	private String state;
	/**
	 * ҵ��Ա��FK�û���
	 */
	private int usersid;
	/**
	 * ¼��ʱ��
	 */
	private String date;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
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
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @param area
	 *            the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @return the housetype
	 */
	public int getHousetype() {
		return housetype;
	}

	/**
	 * @param housetype
	 *            the housetype to set
	 */
	public void setHousetype(int housetype) {
		this.housetype = housetype;
	}

	/**
	 * @return the floor
	 */
	public int getFloor() {
		return floor;
	}

	/**
	 * @param floor
	 *            the floor to set
	 */
	public void setFloor(int floor) {
		this.floor = floor;
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * @return the equipment
	 */
	public String getEquipment() {
		return equipment;
	}

	/**
	 * @param equipment
	 *            the equipment to set
	 */
	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the usersid
	 */
	public int getUsersid() {
		return usersid;
	}

	/**
	 * @param usersid
	 *            the usersid to set
	 */
	public void setUsersid(int usersid) {
		this.usersid = usersid;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}

}
