package com.oldwang.oldwangcrm.model;

/**
 * ������
 * 
 * @author Administrator
 * 
 */
public class Store {
	/**
	 * ������id
	 */
	private int id;
	/**
	 * ����
	 */
	private String name;
	/**
	 * ����
	 */
	private String area;
	/**
	 * �곤
	 */
	private int usersowner;
	/**
	 * ��ַ
	 */
	private String address;

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
	 * @return the usersowner
	 */
	public int getUsersowner() {
		return usersowner;
	}

	/**
	 * @param usersowner
	 *            the usersowner to set
	 */
	public void setUsersowner(int usersowner) {
		this.usersowner = usersowner;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

}
