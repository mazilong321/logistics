package com.bb.pojo;

public class UserRoleKey {
    private Integer userId;

    private Integer roleId;

    public UserRoleKey(Integer userId, Integer roleId) {
		// TODO Auto-generated constructor stub
    	this.userId = userId;
    	this.roleId = roleId;
	}
    
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

	@Override
	public String toString() {
		return "UserRoleKey [userId=" + userId + ", roleId=" + roleId + "]";
	}
    
}