package com.offcn.pojo;

public class Mobile {
    private Integer id;

    private Integer mobilenum;

    private String mobilearea;

    private String mobiletype;

    private String areacode;

    private String postcode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMobilenum() {
        return mobilenum;
    }

    public void setMobilenum(Integer mobilenum) {
        this.mobilenum = mobilenum;
    }

    public String getMobilearea() {
        return mobilearea;
    }

    public void setMobilearea(String mobilearea) {
        this.mobilearea = mobilearea == null ? null : mobilearea.trim();
    }

    public String getMobiletype() {
        return mobiletype;
    }

    public void setMobiletype(String mobiletype) {
        this.mobiletype = mobiletype == null ? null : mobiletype.trim();
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode == null ? null : areacode.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }
}