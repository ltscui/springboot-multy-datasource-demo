package com.datasource.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;

@TableName("CBS_SYS_LOG")
public class SysLog implements Serializable {

	private static final long serialVersionUID = 5313820461668903640L;
	
	/**
	 * 流水号自增
	 */
	private long id;
	
	/**
	 * 日志类型
	 */
	private String type;
	
	/**
	 * 操作日期 格式 YYYY-MM-DD
	 */
	private String operDate;
	
	/**
	 * 操作时间 (格式 HH:MM:SS)
	 */
	private String operTime;
	
	/**
	 * 用户ID
	 */
	private String userId;

	/**
	 * 用户名
	 */
	private String userName;
	
	/**
	 * 操作菜单名称
	 */
	private String menuName;

	/**
	 * 操作内容
	 */
	private String operation;

	/**
	 * 请求方法
	 */
	private String method;

	/**
	 * 请求参数
	 */
	@JsonIgnore
	private String params;
	
	/**
	 * 请求结果
	 */
	@JsonIgnore
	private String result;

	/**
	 * IP地址
	 */
	private String ipAddr;

	/**
	 * 登录设备
	 */
	private String device;
	
	/**
	 * 请求结果
	 */
	@JsonIgnore
	private int delFlag;

	public SysLog() {
		super();
	}

	public SysLog(String type, String operDate, String operTime, String userId, String userName,
			String menuName, String operation, String method, String params, String result, String ipAddr, String device ) {
		super();
		this.type = type;
		this.operDate = operDate;
		this.operTime = operTime;
		this.userId = userId;
		this.userName = userName;
		this.menuName = menuName;
		this.operation = operation;
		this.method = method;
		this.params = params;
		this.result = result;
		this.ipAddr = ipAddr;
		this.device = device;
		this.delFlag = 1;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getOperDate() {
		return operDate;
	}

	public void setOperDate(String operDate) {
		this.operDate = operDate;
	}

	public String getOperTime() {
		return operTime;
	}

	public void setOperTime(String operTime) {
		this.operTime = operTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getIpAddr() {
		return ipAddr;
	}

	public void setIpAddr(String ipAddr) {
		this.ipAddr = ipAddr;
	}

	public int getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(int delFlag) {
		this.delFlag = delFlag;
	}

	@Override
	public String toString() {
		return "SysLog [id=" + id + ", type=" + type + ", operDate=" + operDate + ", operTime=" + operTime + ", userId="
				+ userId + ", userName=" + userName + ", menuName=" + menuName + ", operation=" + operation
				+ ", method=" + method + ", params=" + params + ", result=" + result + ", ipAddr=" + ipAddr
				+ ", device=" + device + ", toString()=" + super.toString() + "]";
	}

}
