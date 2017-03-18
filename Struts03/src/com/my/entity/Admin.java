package com.my.entity;

/**
 * Admin entity. @author MyEclipse Persistence Tools
 */

public class Admin implements java.io.Serializable {

	// Fields

	private Integer adminId;
	private String adminName;
	private String adminPwd;
	private String adminClass;

	// Constructors

	/** default constructor */
	public Admin() {
	}

	/** full constructor */
	public Admin(String adminName, String adminPwd, String adminClass) {
		this.adminName = adminName;
		this.adminPwd = adminPwd;
		this.adminClass = adminClass;
	}

	// Property accessors

	public Integer getAdminId() {
		return this.adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminPwd() {
		return this.adminPwd;
	}

	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}

	public String getAdminClass() {
		return this.adminClass;
	}

	public void setAdminClass(String adminClass) {
		this.adminClass = adminClass;
	}

}