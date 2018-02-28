package com.yonyou.cloud.common.jwt;

import java.io.Serializable;

/**
 * JWT
 * 
 * @author BENJAMIN
 *
 */
public class JwtInfo implements Serializable,IJwtInfo {
	private static final long serialVersionUID = 4561940848549383659L;
	private String username;
    private String userId;
    private String name;
    private String remark;
    private String dealerName;
    private String dealerCode;
    private String telPhone;

//    public JwtInfo(String username, String userId, String name,String dealerCode,
//    		String dealerName,String telPhone) {
//        this.username = username;
//        this.userId = userId;
//        this.name = name;
//        this.dealerCode=dealerCode;
//        this.dealerName=dealerName;
//        this.telPhone=telPhone;
//    }

    public JwtInfo(String username, String userId, String name,String dealerCode,
    		String dealerName,String telPhone,String remark) {
        this.username = username;
        this.userId = userId;
        this.name = name;
        this.dealerCode=dealerCode;
        this.dealerName=dealerName;
        this.telPhone=telPhone;
        this.remark = remark;
    }

    @Override
    public String getUniqueName() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        JwtInfo jwtInfo = (JwtInfo) o;

        if (username != null ? !username.equals(jwtInfo.username) : jwtInfo.username != null) {
            return false;
        }
        return userId != null ? userId.equals(jwtInfo.userId) : jwtInfo.userId == null;

    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }

	@Override
	public String getRemark() {
		return this.remark;
	}

	@Override
	public String getDealerName() {
		// TODO Auto-generated method stub
		return dealerName;
	}

	@Override
	public String getDealerCode() {
		// TODO Auto-generated method stub
		return dealerCode;
	}

	@Override
	public String getTelPhone() {
		// TODO Auto-generated method stub
		return telPhone;
	}
}