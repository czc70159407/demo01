package com.offcn.po;

public class Modile {
	//主键 编号
	private int id;
	//电话号
	private int mobileNum;
	//归属地
	private String mobileArea;
	//类型
	private String mobileType;
	//地区号
	private String areaCode;
	//邮编
	private String postCode;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(int mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getMobileArea() {
		return mobileArea;
	}
	public void setMobileArea(String mobileArea) {
		this.mobileArea = mobileArea;
	}
	public String getMobileType() {
		return mobileType;
	}
	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	
	
	
}
