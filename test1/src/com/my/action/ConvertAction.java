package com.my.action;

import java.util.Date;

import com.my.model.MyPoint;
import com.opensymphony.xwork2.ActionSupport;

public class ConvertAction extends ActionSupport{
	private MyPoint myPoint;
	private int age;
	private Date birhday;
	

	@Override
	public String execute() throws Exception{
		return SUCCESS;
		
	}
	
	public MyPoint getMyPoint() {
		return myPoint;
	}
	public void setMyPoint(MyPoint myPoint) {
		this.myPoint = myPoint;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBirhday() {
		return birhday;
	}

	public void setBirhday(Date birhday) {
		this.birhday = birhday;
	}
}
